package com.klindziuk.task01.ten;

public class Matrix {

	public int[][] initializeMatrix(int order) {
		if (0 > order) {
			throw new IllegalArgumentException("Cannot perform matrix initialization.Order of matrix should be grater than zero.");
		}
		int[][] matrix = new int[order][order];
		for (int i = 0; i < order; i++) {
			for (int j = 0; j < order; j++) {
				if (i % 2 == 0) {
					matrix[i][j] = (j + 1);
				} else {
					matrix[i][j] = (order - j);
				}
			}
		}
		return matrix;
	}
}
