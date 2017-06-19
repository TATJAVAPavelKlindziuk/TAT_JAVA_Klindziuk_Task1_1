package com.klindziuk.task01.four;

public class PointChecker {

	public boolean checkFullLocation(Point2D point) {
		return checkUpperLocation(point) || checkLowerLocation(point);
	}

	private boolean checkUpperLocation(Point2D point) {
		return (point.getX() >= -4 && point.getX() <= 4) && (point.getY() >= -3 && point.getY() <= 0);
	}

	private boolean checkLowerLocation(Point2D point) {
		return (point.getX() >= -2 && point.getX() <= 2) && (point.getY() >= 0 && point.getY() <= 4);
	}
}
