package com.klindziuk.task01.eight;

public class Calculator {

	public int calculateSum(int[] array, int number) {
		if(null == array){
			throw new IllegalArgumentException("Cannot perform calculating with \"null\". ");
		}
		if(0 == number){
			throw new IllegalArgumentException("Cannot divide by Zero.");
		}
		int result = 0;
		for (int i : array) {
			if (i % number == 0) {
				result = result + i;
			}
		}
		return result;
	}
}
