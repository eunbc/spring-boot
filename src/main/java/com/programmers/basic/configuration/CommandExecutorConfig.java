package com.programmers.basic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

import com.programmers.basic.command.CommandExecutor;

@Configuration
public class CommandExecutorConfig {

	private final CommandExecutor commandExecutor;

	public CommandExecutorConfig(CommandExecutor commandExecutor) {
		this.commandExecutor = commandExecutor;
	}

	@Bean
	public CommandLineRunner runCommandExecutor() {
		return args -> commandExecutor.executeCommands();
	}
}