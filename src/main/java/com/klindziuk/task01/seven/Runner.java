package com.klindziuk.task01.seven;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {
		new TaskSevenArgsChecker().fullArgsCheck(args);
		PrintHelper.print(new Calculator().calculateFunction(args));
		}	
	}

