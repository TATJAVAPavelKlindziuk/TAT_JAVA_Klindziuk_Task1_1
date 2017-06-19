package com.klindziuk.task01.three;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {

	public static void main(String[] args) {

		new TaskThreeArgsChecker().fullArgsCheck(args);
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			RightTriangle.init(a, b, c);

		} catch (IllegalArgumentException iaex) {
			PrintHelper.print(iaex.getMessage());
		}
		RightTriangle triangle = RightTriangle.getInstance();
		Calulator calculator = new Calulator();
		PrintHelper.print("The square of  is",
				calculator.calculateTriangleSquare(triangle.getSideA(), triangle.getSideB()));
		PrintHelper.print("The perimeter of righ triangle is",
				calculator.calculateTrianglePerimeter(triangle.getSideA(), triangle.getSideB()));
	}
}
