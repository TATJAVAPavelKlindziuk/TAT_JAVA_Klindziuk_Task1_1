package com.klindziuk.task01.one;

import com.klindziuk.task01.util.PrintHelper;

public class TaskOneArgsChecker {
	
	private static final int REQUIRED_ARGS_LENGTH = 1;
	private static final int RATIO_NUMBER = 2;
	private static final int MAXIMUM_QUANTITY_OF_NUMBERS = 100_000;
	private static final String REGEXP_PATTERN = "\\d+";

	private void checkArgumentsSize(String[] args) {
		if (0 == args.length) {
			PrintHelper.print("You don't input number for calculating.Please,try again.");
			System.exit(-1);
		}
		if (REQUIRED_ARGS_LENGTH < args.length) {
			PrintHelper.print("You input too many arguments.Only one number needed.Please, try again.");
			System.exit(-1);
		}
	}

	private void checkEvenQuantityOfSymbols(String lineOfNumber) {
		if ((lineOfNumber.length() % RATIO_NUMBER) != 0) {
			PrintHelper.print("Can't calculate lucky number.Quantity of numbers must be even.Please try again.");
			System.exit(-1);
		}
	}

	private void checkMaxQuantityOfSymbols(String lineOfNumber) {
		if (lineOfNumber.length() > MAXIMUM_QUANTITY_OF_NUMBERS) {
			PrintHelper.print("Can't calculate lucky number.Quantity of numbers is bigger than "
					+ MAXIMUM_QUANTITY_OF_NUMBERS + ".Please try again.");
			System.exit(-1);
		}
	}

	private void checkSpecialSymbols(String lineOfNumber) {
		if (!lineOfNumber.matches(REGEXP_PATTERN)) {
			PrintHelper.print("Only numbers allowed.Please try again.");
			System.exit(-1);
		}
	}

	public void fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args[0]);
		checkSpecialSymbols(args[0]);
		checkEvenQuantityOfSymbols(args[0]);
	}
}
