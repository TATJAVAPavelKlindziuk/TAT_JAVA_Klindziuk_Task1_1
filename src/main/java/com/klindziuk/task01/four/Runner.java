package com.klindziuk.task01.four;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	public static void main(String[] args) {
		try {
			new TaskFourArgsChecker().fullArgsCheck(args);
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			Area2D lowerArea = new Area2D(Dimension.LOWER_MIN_X,Dimension.LOWER_MAX_X,Dimension.LOWER_MIN_Y,Dimension.LOWER_MAX_X);
			Area2D upperArea = new Area2D(Dimension.UPPER_MIN_X,Dimension.UPPER_MAX_X,Dimension.UPPER_MIN_Y,Dimension.UPPER_MAX_Y);
			Point2D point = new Point2D(x, y);
			PrintHelper.print("Does the point of the filled area belong ?",
					new PointChecker().checkFullLocation(lowerArea, upperArea, point));
		} catch (NumberFormatException nfex) {
			PrintHelper.print("Exception during pasring the line.");
		} catch (IllegalArgumentException ieax) {
			PrintHelper.print(ieax.getMessage());
		}
	}
}
