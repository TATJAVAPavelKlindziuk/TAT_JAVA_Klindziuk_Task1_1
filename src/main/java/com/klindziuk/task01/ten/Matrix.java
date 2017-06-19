package com.klindziuk.task01.ten;

public class Matrix {

	public int[][] initializeMatrix(int oreder) {
		int[][] matrix = new int[oreder][oreder];
		for (int i = 0; i < oreder; i++) {
			for (int j = 0; j < oreder; j++) {
				if (i % 2 == 0) {
					matrix[i][j] = (j + 1);
				} else {
					matrix[i][j] = (oreder - j);
				}
			}
		}
		return matrix;
	}
}
