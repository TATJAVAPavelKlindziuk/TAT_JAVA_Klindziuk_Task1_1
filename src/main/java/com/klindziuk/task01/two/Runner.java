package com.klindziuk.task01.two;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		try {
			new TaskTwoArgsChecker().fullArgsCheck(args);
			double[] numbers = ArrayUtils.convertArrayOfStringsToDouble(args);
			PrintHelper.print("The result of the expression is", new Calculator().calculateExpression(numbers));
		} catch (NumberFormatException nfex) {
			PrintHelper.print("Exception during pasring the arguments.");
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
