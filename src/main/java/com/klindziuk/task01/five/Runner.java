package com.klindziuk.task01.five;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		try {
			new TaskFiveArgsChecker().fullArgsCheck(args);
			double[] numbers = ArrayUtils.convertArrayOfStringsToDouble(args);
			PrintHelper.print("Before powering", numbers);
			PrintHelper.print("After powering", new PowerCalculator().calculatePower(numbers));
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
