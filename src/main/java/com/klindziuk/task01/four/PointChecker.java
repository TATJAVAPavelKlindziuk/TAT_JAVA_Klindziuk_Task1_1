package com.klindziuk.task01.four;

public class PointChecker {
	
	private static final String EXCEPTION_MESSAGE = "Cannot check locations for \"null\".";

	public boolean checkFullLocation(Area2D lower, Area2D upper, Point2D point) {
		if (null == point) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		if (null == lower) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		if (null == upper) {
			throw new IllegalArgumentException(EXCEPTION_MESSAGE);
		}
		return checkUpperLocation(upper, point) || checkLowerLocation(lower,point);
	}

	private boolean checkUpperLocation(Area2D upper, Point2D point) {
		return (point.getX() >= upper.getX1() && point.getX() <= upper.getX2())
				&& (point.getY() >= upper.getY1() && point.getY() <= upper.getY2());
	}

	private boolean checkLowerLocation(Area2D lower, Point2D point) {
		return (point.getX() >= lower.getX1() && point.getX() <= lower.getX2())
				&& (point.getY() >= lower.getY1() && point.getY() <= lower.getY2());
	}
}
