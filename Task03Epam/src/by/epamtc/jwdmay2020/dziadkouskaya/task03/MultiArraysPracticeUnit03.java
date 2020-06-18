package by.epamtc.jwdmay2020.dziadkouskaya.task03;

public class MultiArraysPracticeUnit03 {
	public static void main(String[] args) {

		int number = 10;

		int[][] matrix = createMatrixWithOnesAndZeros(number);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	public static int[][] createMatrixWithOnesAndZeros(int evenNumber) {
		int[][] matrix = new int[evenNumber][evenNumber];

		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (j < i || j > evenNumber - 1 - i) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 1;
				}

			}
		}
		
		for (int i = matrix.length / 2; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (j > i || j < evenNumber - 1 - i) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 1;
				}

			}
		}

		return matrix;
	}
}