package by.epamtc.jwdmay2020.dziadkouskaya.task03;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/*
Дана последовательность целых чисел a1, a2, ... an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны  min(a1, a2, ... an).
*/
public class ArraysPracticeUnit02 {
	public static void main(String[] args) {
		int[] array = {-47, 5487, 45, 12, 0, -47, 7585, 1, -45, 0, -45, -45};

		int[] resultArray = findArrayWithoutMinValues(array);

		System.out.println(Arrays.toString(resultArray));
		
	}

	public static int[] findArrayWithoutMinValues(int[] array) {

		int minValue = array[0];

		int minValueCounter = 0;

		for (int i : array) {
			if (i < minValue) {
				minValue = i;
				minValueCounter = 1;
			}
			if (i == minValue) {
				minValueCounter += 1;
			}
		}

		int[] resultArray = new int[array.length - minValueCounter];

		int counterForResultArray = 0;
		
		for (int i : array) {
			if (i > minValue) {
				resultArray[counterForResultArray++] = i;
			}
		}

		return resultArray;

	}

}
