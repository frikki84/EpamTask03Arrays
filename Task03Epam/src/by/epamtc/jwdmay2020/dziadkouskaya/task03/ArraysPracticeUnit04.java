package by.epamtc.jwdmay2020.dziadkouskaya.task03;
/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
Если таких чисел несколько, то определить наименьшее из них.
*/

import java.util.Arrays;

public class ArraysPracticeUnit04 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 7, 8, -45, 4, -45, -45, 1, 1 };

		String result = chechRepeatedNumbersInArray(array);

		System.out.println(result);
	}
	

	public static String chechRepeatedNumbersInArray(int[] array) {

		String msg = "There are no duplicate values in the array";

		Arrays.sort(array);

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {

				int minValue = findMinRepeatedNumber(array, i);

				msg = "The smallest of duplicate values is " + minValue;
				break;
			}
		}
		return msg;

	}

	public static int findMinRepeatedNumber(int[] array, int positionNumber) {
		
		int minValue = array[positionNumber];

		int minValueCounter = 0;

		int maxValueOfCounters = 0;

		for (int i = positionNumber; i < array.length - 1; i++) {

			if (array[i] == array[i + 1]) {
				minValueCounter += 1;

			} else {
				if (maxValueOfCounters < minValueCounter) {
					maxValueOfCounters = minValueCounter;
					minValue = array[i];
				}
				minValueCounter = 0;
			}
		}

		return minValue;
	}

}
