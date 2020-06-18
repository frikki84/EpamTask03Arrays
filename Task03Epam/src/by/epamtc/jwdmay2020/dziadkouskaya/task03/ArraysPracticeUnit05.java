package by.epamtc.jwdmay2020.dziadkouskaya.task03;

/*
Дан одномерный массив A[N]. Найти max(a2,a4,.a2k)+min(a1,a3,.,a2k+1)
*/

public class ArraysPracticeUnit05 {
	public static void main(String[] args) {
	
		int [] array = {1, 2, 3, 4, -1, -2, -3, -4};
		
		int result = findSummMaxMinValues(array);
		
		System.out.println(result);

	}

	public static int findSummMaxMinValues(int[] array) {
		int maxValue = array[1];

		int minValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (i % 2 == 0) {

				if (array[i] < minValue) {
					minValue = array[i];
				}
			} else {

				if (array[i] > maxValue) {
					maxValue = array[i];
				}
			}

		}

		int result = minValue + maxValue;
		
		return result;
	}
}
