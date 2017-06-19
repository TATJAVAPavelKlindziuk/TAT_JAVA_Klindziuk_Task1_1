package com.klindziuk.task01.five;

public class PowerCalculator {

	public double[] calculatePower(double[] array) {
		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				result[i] = Math.pow(array[i], 2);
			} else {
				result[i] = Math.pow(array[i], 4);
			}
		}
		return result;
	}
}
