package com.klindziuk.task01.ten;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		int order = new TaskTenArgsChecker().fullArgsCheck(args);
		PrintHelper.print( new Matrix().initializeMatrix(order));
	}
}
