package by.epamtc.jwdmay2020.dziadkouskaya.task03;

public class MultiArraysPracticeUnit02 {

	public static void main(String[] args) {
		int number = 8;

		int[][] matrix = createMatrixWithDiagonal(number);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("\n");
		}

	}

	public static int[][] createMatrixWithDiagonal(int evenNumber) {
		int[][] matrix = new int[evenNumber][evenNumber];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					matrix[i][j] = (i + 1) * (i + 2);
				} else {
					matrix[i][j] = 0;
				}

			}
		}

		return matrix;
	}
}