package by.epamtc.jwdmay2020.dziadkouskaya.task03;

/*Даны действительные числа a1, a2, ... an
Найти max(a1+a2n, a2+a2n-1, ... an+an+1)

*/

public class ArraysPracticeUnit01 {
	public static void main(String[] args) {
		int[] array = { 5487, 45, 12, 7585, 1, -47, -4578};
		int maxArrayValue = findMaxValueOfArray(array);
		System.out.println("Max summ value is " + maxArrayValue);

	}

	public static int findMaxValueOfArray(int[] array) {

		int middleValue = array[0] + array[array.length - 1];

		int maxValue = middleValue;

		for (int i = 1; i < array.length / 2; i++) {

			middleValue = array[i] + array[array.length - (i + 1)];

			if (middleValue > maxValue) {
				maxValue = middleValue;
			}
		}

		return maxValue;
	}

}
