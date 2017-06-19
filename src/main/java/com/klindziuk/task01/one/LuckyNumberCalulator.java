package com.klindziuk.task01.one;

public class LuckyNumberCalulator {

	public boolean isLuckyNumber(int[] arr) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			sum1 = sum1 + arr[i];
			sum2 = sum2 + arr[arr.length - 1 - i];
		}
		return (sum1 == sum2);
	}
}
