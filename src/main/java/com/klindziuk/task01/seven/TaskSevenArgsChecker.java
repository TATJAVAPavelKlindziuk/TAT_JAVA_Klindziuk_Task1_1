package com.klindziuk.task01.seven;

import com.klindziuk.task01.util.PrintHelper;

public class TaskSevenArgsChecker {
	
	private static final int REQUIRED_ARGS_LENGTH = 3;
	private static final int MAXIMUM_QUANTITY_OF_NUMBERS = 1_000;
	private static final String REGEXP_PATTERN = "[0-9-]+";

	private void checkArgumentsSize(String[] args) {
		if (0 == args.length) {
			PrintHelper.print("You don't input numbers for calculating function.Please,try again.");
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH < args.length) {
			PrintHelper.print("You input too many arguments.Only three numbers needed.Please, try again.");
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH > args.length) {
			PrintHelper.print("You input not enough arguments.Three numbers needed.Please, try again.");
			System.exit(-1);
		}
	}

	private void checkFirstArgumentForZero(String lineOfNumber) {
		if ("0".equals(lineOfNumber)) {
			PrintHelper.print("Step of function can't be zero.Please try again.");
			System.exit(-1);
		}
	}

	private void checkMaxQuantityOfSymbols(String[] args) {
		for (String line : args) {
			if (line.length() > MAXIMUM_QUANTITY_OF_NUMBERS) {
				PrintHelper.print(
						"Quantity of numbers is bigger than " + MAXIMUM_QUANTITY_OF_NUMBERS + ".Please try again");
				System.exit(-1);
			}
		}
	}

	private void checkForSpecialSymbols(String[] args) {
		for (String line : args) {
			if (!line.matches(REGEXP_PATTERN)) {
				PrintHelper.print("Only numbers allowed.Please try again.");
				System.exit(-1);
			}
		}
	}

	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args);
		checkForSpecialSymbols(args);
		checkFirstArgumentForZero(args[2]);
	}
}
