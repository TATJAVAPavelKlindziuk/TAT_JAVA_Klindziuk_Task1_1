package com.klindziuk.task01.seven;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		try {
			new TaskSevenArgsChecker().fullArgsCheck(args);
			PrintHelper.print(new Calculator().calculateFunction(args));
		} catch (NumberFormatException nfex) {
			PrintHelper.print("Exception during pasring the line.");
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
