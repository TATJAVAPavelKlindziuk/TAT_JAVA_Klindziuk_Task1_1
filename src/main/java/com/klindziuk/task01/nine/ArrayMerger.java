package com.klindziuk.task01.nine;

public class ArrayMerger {

	public int[] mergeArrayfromPreterminiedPosition(int[] firstArray, int[] secondArray, int position) {
		if (null == firstArray || null == secondArray) {
			throw new IllegalArgumentException("Cannot perform merge with \"null\".");
		}
		if (position > firstArray.length - 1) {
			throw new IllegalArgumentException("Cannot perform merge.Position is larger than array length.");
		}

		int[] result = new int[firstArray.length + secondArray.length];
		System.arraycopy(firstArray, 0, result, 0, position);
		System.arraycopy(secondArray, 0, result, position, secondArray.length);
		System.arraycopy(firstArray, position, result, secondArray.length + position, firstArray.length - position);
		return result;
	}
}
