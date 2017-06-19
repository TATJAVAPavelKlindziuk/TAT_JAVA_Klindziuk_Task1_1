package com.klindziuk.task01.ten;

import com.klindziuk.task01.util.PrintHelper;

public class TaskTenArgsChecker {

	private static final int MAXIMUM_QUANTITY_OF_NUMBERS = 100_000;
	private static final String REGEXP_PATTERN = "\\d+";

	private void checkArgumentsSize(String[] args) {
		if (0 == args.length) {
			PrintHelper.print("You don't input number for calculating.Please,try again.");
			System.exit(-1);
		}
		if (1 < args.length) {
			System.out.println("You input too many arguments.Only one number needed.Please, try again.");
			System.exit(-1);
		}
	}

	private void checkMaxQuantityOfSymbols(String lineOfNumber) {
		if (lineOfNumber.length() > MAXIMUM_QUANTITY_OF_NUMBERS) {
			PrintHelper.print("Can't calculate lucky number.Quantity of numbers is bigger than "
					+ MAXIMUM_QUANTITY_OF_NUMBERS + ".Please try again");
			System.exit(-1);
		}
	}

	private void checkSpecialSymbols(String lineOfNumber) {
		if (!lineOfNumber.matches(REGEXP_PATTERN)) {
			PrintHelper.print("Only numbers allowed.Please try again");
			System.exit(-1);
		}
	}

	public int fullArgsCheck(String[] args) {
		checkArgumentsSize(args);
		checkMaxQuantityOfSymbols(args[0]);
		checkSpecialSymbols(args[0]);
		return Integer.parseInt(args[0]);
	}
}
