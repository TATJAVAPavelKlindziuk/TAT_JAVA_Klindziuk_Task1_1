package com.klindziuk.task01.five;

public class PowerCalculator {

	public double[] calculatePower(double[] array) {
			for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				array[i] = Math.pow(array[i], 2);
			} else {
				array[i] = Math.pow(array[i], 4);
			}
		}
		return array;
	}
}
