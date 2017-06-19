package com.klindziuk.task01.util;

public class ArrayUtils {

	public static int[] createArrayFromStringLine(String line) {
		int[] result = new int[line.length()];
		for (int i = 0; i < line.length(); i++) {
			result[i] = line.charAt(i) - '0';
		}
		return result;
	}

	public static int[] createArrayWithFloatQuantity(int quantityOfElements) {
		int[] result = new int[quantityOfElements];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * (9 - 0) + 1);
		}
		return result;
	}

	public static int[] convertArrayOfStringsToInt(String[] args) {
		int[] result = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Integer.parseInt(args[i]);
		}
		return result;
	}

	public static double[] convertArrayOfStringsToDouble(String[] args) {
		double[] result = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Double.parseDouble(args[i]);
		}
		return result;
	}
}
