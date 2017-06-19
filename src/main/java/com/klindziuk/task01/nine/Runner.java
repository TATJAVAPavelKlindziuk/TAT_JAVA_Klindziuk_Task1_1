package com.klindziuk.task01.nine;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		try {
			new TaskNineArgsChecker().fullArgsCheck(args);
			int[] arguments = ArrayUtils.convertArrayOfStringsToInt(args);
			int[] firstArray = ArrayUtils.createArrayWithFloatQuantity(arguments[0]);
			int[] secondArray = ArrayUtils.createArrayWithFloatQuantity(arguments[1]);
			int[] result = new ArrayMerger().mergeArrayfromPreterminiedPosition(firstArray, secondArray, arguments[2]);
			PrintHelper.print("First array", firstArray);
			PrintHelper.print("Second array", secondArray);
			PrintHelper.print("Merged array", result);
		} catch (IllegalArgumentException iaex) {
			PrintHelper.print(iaex.getMessage());
		}
	}
}
