package com.klindziuk.task01.six;

import java.util.Arrays;

public class Calculator {

	public int calculateSumOfMinAndMax(int[] array) {
		if (null == array) {
			throw new IllegalArgumentException("Cannot calculate Sum of min and max for \"null\".");
		}
		Arrays.sort(array);
		return array[0] + array[array.length - 1];
	}
}
