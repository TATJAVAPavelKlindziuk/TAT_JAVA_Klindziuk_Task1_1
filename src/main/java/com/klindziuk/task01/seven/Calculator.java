package com.klindziuk.task01.seven;

import java.util.Map;
import java.util.TreeMap;

public class Calculator {

	public Map<Double, Double> calculateFunction(String[] args) {
		Map<Double, Double> result = new TreeMap<>();
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double step = Double.parseDouble(args[2]);

		do {
			double function = Math.pow(Math.sin(a), 2) - Math.cos(2 * a);
			result.put(a, function);
		} while ((a = a + step) <= b);
		return result;
	}
}
