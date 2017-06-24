package com.klindziuk.task01.util;

public class ArrayUtils {
	private static final String REGEXP_FOR_INTEGER_PATTERN = "\\d+";
	private static final String REGEXP_FOR_DOUBLE_PATTERN = "[0-9]+([,.][0-9]{1,2})?";

	public static int[] createArrayFromStringLine(String line) {
		if (null == line) {
			throw new IllegalArgumentException("Cannot perform creation of array from \"null\"");
		}
		if ("".equals(line)) {
			throw new IllegalArgumentException("Cannot perform creation of array from empty line");
		}
		if (!line.matches(REGEXP_FOR_INTEGER_PATTERN)){
			throw new IllegalArgumentException("Cannot perform creation of array.Line contains restricted symbols");	
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
		for (String line : args) {
			if (!line.matches(REGEXP_FOR_INTEGER_PATTERN)) {
				throw new IllegalArgumentException("Cannot perform creation of array.Line contains restricted symbols");
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
		for (String line : args) {
			if (!line.matches(REGEXP_FOR_DOUBLE_PATTERN)) {
				throw new IllegalArgumentException("Cannot perform creation of array.Line contains restricted symbols");
			}
		}
		double[] result = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			result[i] = Double.parseDouble(args[i]);
		}
		return result;
	}
}
