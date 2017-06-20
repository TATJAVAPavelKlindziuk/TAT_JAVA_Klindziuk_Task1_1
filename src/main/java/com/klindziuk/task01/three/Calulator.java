package com.klindziuk.task01.three;

public class Calulator {

	public double calculateTriangleSquare(double a, double b) {
		if (0 > a || 0 > b) {
			throw new IllegalArgumentException("Cannot perform square calculation.Sides are should be greater than zero.");
		}
		return (a * b) / 2;
	}

	public double calculateTrianglePerimeter(double a, double b) {
		if (0 > a || 0 > b) {
			throw new IllegalArgumentException("Cannot perform perimeter calculation.Sides are should be greater than zero.");
		}
		return a + b + Math.sqrt(a * a + b * b);
	}
}
