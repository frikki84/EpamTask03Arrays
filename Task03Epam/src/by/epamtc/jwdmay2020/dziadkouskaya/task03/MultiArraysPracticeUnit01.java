package by.epamtc.jwdmay2020.dziadkouskaya.task03;

import java.util.Arrays;

public class MultiArraysPracticeUnit01 {

	public static void main(String[] args) {
		int number = 8;

		int[][] matrix = createMatrix(number);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}

	}

	public static int[][] createMatrix(int evenNumber) {
		int[][] matrix = new int[evenNumber][evenNumber];

		for (int i = 0; i < evenNumber; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < evenNumber; j++) {
					matrix[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < evenNumber; j ++) {
					matrix[i][j] = evenNumber - j;
				}
			}

		}

		return matrix;
	}
}
