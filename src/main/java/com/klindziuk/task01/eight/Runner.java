package com.klindziuk.task01.eight;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	public static void main(String[] args) {
		try {
			new TaskEightArgsChecker().fullArgsCheck(args);
			int[] arguments = ArrayUtils.convertArrayOfStringsToInt(args);
			int[] array = ArrayUtils.createArrayWithFloatQuantity(arguments[0]);
			PrintHelper.print("Elements of array", array);
			PrintHelper.print("Sum of multiple elements is", new Calculator().calculateSum(array, arguments[1]));
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
