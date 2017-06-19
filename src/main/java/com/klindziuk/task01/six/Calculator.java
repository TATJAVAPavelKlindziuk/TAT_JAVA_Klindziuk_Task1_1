package com.klindziuk.task01.six;

import java.util.Arrays;

public class Calculator {

	public int calculateMinAndMaxSum(int[] array) {
		Arrays.sort(array);
		return array[0] + array[array.length - 1];
	}
}
