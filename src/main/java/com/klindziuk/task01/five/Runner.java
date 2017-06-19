package com.klindziuk.task01.five;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		new TaskFiveArgsChecker().fullArgsCheck(args);
		double[] numbers = ArrayUtils.convertArrayOfStringsToDouble(args);
		PrintHelper.print("Before powering", args);
		PrintHelper.print("After powering", new PowerCalculator().calculatePower(numbers));
	}
}
