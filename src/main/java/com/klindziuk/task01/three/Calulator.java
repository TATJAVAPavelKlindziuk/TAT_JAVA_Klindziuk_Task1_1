package com.klindziuk.task01.three;

public class Calulator {

	public double calculateTriangleSquare(double a, double b) {
		return (a * b) / 2;
	}

	public double calculateTrianglePerimeter(double a, double b) {
		return a + b + Math.sqrt(a * a + b * b);
	}
}
