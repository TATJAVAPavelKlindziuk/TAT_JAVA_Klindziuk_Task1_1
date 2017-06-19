package com.klindziuk.task01.three;

public class RightTriangle {

	private static RightTriangle triangle;

	private double sideA;
	private double sideB;
	private double sideC;

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	private RightTriangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public static void init(double sideA, double sideB, double sideC) throws IllegalArgumentException {
		 triangle = null;
		if ((SideChecker.checkSides(sideA, sideB, sideC) && SideChecker.isRightTriangle(sideA, sideB, sideC))) {
			triangle = new RightTriangle(sideA, sideB, sideC);
		} else
			throw new IllegalArgumentException("Unfortunately we can't create RIGH triangle with this sides.Please try again.");
	}

	public static RightTriangle getInstance() {
		return triangle;
	}

}
