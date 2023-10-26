package com.programmers.springbasic.enums;

import static com.programmers.springbasic.enums.ErrorCode.*;

import java.util.Arrays;

import com.programmers.springbasic.command.Command;
import com.programmers.springbasic.command.main.ExitCommand;
import com.programmers.springbasic.command.main.SelectCustomerCommand;
import com.programmers.springbasic.command.main.SelectVoucherCommand;

public enum MainCommandType {

	VOUCHER_MANAGEMENT("voucher", SelectVoucherCommand.class),
	CUSTOMER_MANAGEMENT("customer", SelectCustomerCommand.class),
	EXIT("exit", ExitCommand.class);

	private final String inputString;
	private final Class<? extends Command> commandClass;

	MainCommandType(String inputString, Class<? extends Command> commandClass) {
		this.inputString = inputString;
		this.commandClass = commandClass;
	}

	public static MainCommandType from(String readString) {
		return Arrays.stream(MainCommandType.values())
			.filter(type -> type.inputString.equalsIgnoreCase(readString))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException(INVALID_COMMAND_TYPE.getMessage()));
	}

	public Class<? extends Command> getCommandClass() {
		return this.commandClass;
	}
}
