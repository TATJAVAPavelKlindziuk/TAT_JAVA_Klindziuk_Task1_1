package com.klindziuk.task01.one;

public class LuckyNumberCalulator {

	public boolean isLuckyNumber(int[] array) {
		if (null == array) {
			throw new IllegalArgumentException("Cannot calculate lucky number \"null\".");
		}
		int firstSum = 0;
		int secondSum = 0;
		for (int i = 0; i < array.length / 2; i++) {
			firstSum = firstSum + array[i];
			secondSum = secondSum + array[array.length - 1 - i];
		}
		return (firstSum == secondSum);
	}
}
