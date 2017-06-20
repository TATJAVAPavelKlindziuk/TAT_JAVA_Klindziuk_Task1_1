package com.klindziuk.task01.one;

import com.klindziuk.task01.util.ArrayUtils;
import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		try {
			new TaskOneArgsChecker().fullArgsCheck(args);
			int[] array = ArrayUtils.createArrayFromStringLine(args[0]);
			PrintHelper.print("Is the number " + args[0] + " lucky?", new LuckyNumberCalulator().isLuckyNumber(array));
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
