package com.programmers.springbasic.command;

import java.util.List;

import com.programmers.springbasic.console.ConsoleOutputHandler;
import com.programmers.springbasic.controller.VoucherController;
import com.programmers.springbasic.dto.GetVouchersResponse;

public class GetVouchersCommand implements Command {
	private final VoucherController voucherController;
	private final ConsoleOutputHandler consoleOutputHandler;

	public GetVouchersCommand(VoucherController voucherController, ConsoleOutputHandler consoleOutputHandler) {
		this.voucherController = voucherController;
		this.consoleOutputHandler = consoleOutputHandler;
	}

	@Override
	public void execute() {
		List<GetVouchersResponse> vouchers = voucherController.getVouchers();
		consoleOutputHandler.printList(vouchers);
	}
}