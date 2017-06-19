package com.klindziuk.task01.two;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	
	public static void main(String[] args){
		new TaskTwoArgsChecker().fullArgsCheck(args);
		PrintHelper.print("The result of the expression is", new Calculator().calculateExpression(args));
	}
}
