package com.klindziuk.task01.two;

public class Calculator {

	public double calculateExpression(String[] args) {
		if (null == args) {
			throw new IllegalArgumentException("Cannot perform calculation of expression with \"null\".");
		}
		if ("0".equals(args[0])) {
			throw new IllegalArgumentException("First argument cannot be equal to 0.");
		}
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
	}
}
