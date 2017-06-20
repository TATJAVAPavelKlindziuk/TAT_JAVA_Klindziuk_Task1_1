package com.klindziuk.task01.four;

public class PointChecker {
	private static final int UPPER_HALF_X_PLUS = -4;
	private static final int UPPER_HALF_X_MINUS = -4;
	private static final int UPPER_HALF_Y_PLUS = -3;
	private static final int UPPER_HALF_Y_MINUS = 0;
	private static final int LOWER_HALF_X_PLUS = -2;
	private static final int LOWER_HALF_X_MINUS = 2;
	private static final int LOWER_HALF_Y_PLUS = 0;
	private static final int LOWER_HALF_Y_MINUS = 4;

	public boolean checkFullLocation(Point2D point) {
		if (null == point) {
			throw new IllegalArgumentException("Cannot check locations for \"null\".");
		}
		return checkUpperLocation(point) || checkLowerLocation(point);
	}

	private boolean checkUpperLocation(Point2D point) {
		return (point.getX() >= UPPER_HALF_X_MINUS && point.getX() <= UPPER_HALF_X_PLUS)
				&& (point.getY() >= UPPER_HALF_Y_MINUS && point.getY() <= UPPER_HALF_Y_PLUS);
	}

	private boolean checkLowerLocation(Point2D point) {
		return (point.getX() >= LOWER_HALF_X_MINUS && point.getX() <= LOWER_HALF_X_PLUS)
				&& (point.getY() >= LOWER_HALF_Y_MINUS && point.getY() <= LOWER_HALF_Y_PLUS);
	}
}
