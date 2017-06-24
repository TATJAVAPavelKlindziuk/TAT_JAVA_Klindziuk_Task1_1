package com.klindziuk.task01.six;

import com.klindziuk.task01.util.PrintHelper;

public class TaskSixArgsChecker {

	private static final int REQUIRED_ARGS_LENGTH = 3;
	private static final int MAXIMUM_QUANTITY_OF_NUMBERS = 1_000;
	private static final String REGEXP_PATTERN = "[0-9-]+";
	private static final String ZERO_ARGS_ERROR_MESSAGE = "You don't input numbers for calculating.Please,try again.";
	private static final String TOO_MANY_ARGS_ERROR_MESSAGE = "You input too many arguments.Only two numbers needed.Please, try again.";
	private static final String NOT_ENOUGHT_ARGS_ERROR_MESSAGE = "You input not enough arguments.Two numbers needed.Please, try again.";
	private static final String RESTRICTED_SYMBOLS_ERROR_MESSAGE = "Only numbers allowed.Please try again.";
	private static final String QUANTITY_ERROR_MESSAGE = "Quantity of numbers is bigger than "
			+ MAXIMUM_QUANTITY_OF_NUMBERS + ".Please try again.";

	private void checkArgumentsSize(String[] args) {
		if (0 == args.length) {
			PrintHelper.print(ZERO_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH > args.length) {
			PrintHelper.print(NOT_ENOUGHT_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH < args.length) {
			PrintHelper.print(TOO_MANY_ARGS_ERROR_MESSAGE);
			System.exit(-1);
		}
	}

	private void checkMaxQuantityOfSymbols(String[] args) {
		for (String line : args) {
			if (line.length() > MAXIMUM_QUANTITY_OF_NUMBERS) {
				PrintHelper.print(QUANTITY_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}

	private void checkForSpecialSymbols(String[] args) {
		for (String line : args) {
			if (!line.matches(REGEXP_PATTERN)) {
				PrintHelper.print(RESTRICTED_SYMBOLS_ERROR_MESSAGE);
				System.exit(-1);
			}
		}
	}

	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
	}
}
