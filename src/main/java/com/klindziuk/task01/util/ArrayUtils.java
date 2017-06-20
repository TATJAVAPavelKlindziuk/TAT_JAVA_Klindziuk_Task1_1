package com.klindziuk.task01.util;

public class ArrayUtils {

	public static int[] createArrayFromStringLine(String line) {
		if (null == line) {
			throw new IllegalArgumentException("Cannot perform creation of array from \"null\"");
		}
		if ("".equals(line)) {
			throw new IllegalArgumentException("Cannot perform creation of array from empty line");
		}
		int[] result = new int[line.length()];
		for (int i = 0; i < line.length(); i++) {
			result[i] = line.charAt(i) - '0';
		}
		return result;
	}

	public static int[] createArrayWithFloatQuantity(int quantityOfElements) {
		if (0 > quantityOfElements) {
			throw new IllegalArgumentException(
					"Cannot perform creation of array.Size of array should be grater than zero.");
		}
		int[] result = new int[quantityOfElements];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * (9 - 0) + 1);
		}
		return result;
	}

	public static int[] convertArrayOfStringsToInt(String[] args) {
		if (null == args) {
			throw new IllegalArgumentException("Cannot perform convert from \"null\" to int[].");
		}
		for (String line : args) {
			if ("".equals(line)) {
				throw new IllegalArgumentException("Cannot perform creation of double  from empty line");
			}
		}
		int[] result = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Integer.parseInt(args[i]);
		}
		return result;
	}

	public static double[] convertArrayOfStringsToDouble(String[] args) {
		if (null == args) {
			throw new IllegalArgumentException("Cannot perform convert \"null\" to double[].");
		}
		for (String line : args) {
			if ("".equals(line)) {
				throw new IllegalArgumentException("Cannot perform creation of int from empty line");
			}
		}
		double[] result = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Double.parseDouble(args[i]);
		}
		return result;
	}
}
