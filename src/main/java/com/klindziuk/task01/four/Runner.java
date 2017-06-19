package com.klindziuk.task01.four;

import com.klindziuk.task01.util.PrintHelper;

public class Runner {
	public static void main(String[] args) {
		new TaskFourArgsChecker().fullArgsCheck(args);
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Point2D point = new Point2D(x, y);
		PrintHelper.print("Does the point of the filled area belong ?", new PointChecker().checkFullLocation(point));
	}
}
