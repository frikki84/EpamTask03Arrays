package by.epamtc.jwdmay2020.dziadkouskaya.task03;

import java.text.BreakIterator;
import java.util.Arrays;

import javax.swing.text.AbstractDocument.BranchElement;

/*
«Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить игральные кубики. 
Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. 
(Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая разгадывает код замка при условии, 
что два кубика уже вставлены в ячейки.
*/
public class ArraysPractiveUnit03 {
	public static void main(String[] args) {
		int[] arrayForCode1 = { 6, 0, 0, 4, 0, 0, 0, 0, 0, 0 };
		int[] arrayForCode2 = { 1, 0, 0, 0, 0, 5, 0, 0, 0, 0 };

		String resultForArray1 = findLockCode(arrayForCode1);
		String resultForArray2 = findLockCode(arrayForCode2);

		System.out.println(resultForArray1 + "\n" + resultForArray2);

	}

	public static String findLockCode(int[] array) {

		String resultMessage = "The code doesn't exist.";

		int[] finalCode = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int firstNumberIndex = 0;
		int secondNumberIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				firstNumberIndex = i;
				break;
			}
		}

		for (int i = firstNumberIndex + 1; i < array.length; i++) {
			if (array[i] != 0) {
				secondNumberIndex = i;
			}
		}

		int[] threeNumberArray = new int[3];

		int position2InNewArray = (secondNumberIndex - firstNumberIndex) % 3 > 1 ? 2 : 1;

		int position3InNewArray = (secondNumberIndex - firstNumberIndex) % 3 > 1 ? 1 : 2;

		threeNumberArray[firstNumberIndex % 3] = array[firstNumberIndex];

		threeNumberArray[(firstNumberIndex + position2InNewArray) % 3] = array[secondNumberIndex];

		threeNumberArray[(firstNumberIndex + position3InNewArray) % 3] = 10 - array[firstNumberIndex]
				- threeNumberArray[(firstNumberIndex + position2InNewArray) % 3];

		for (int i = 0; i < finalCode.length; i++) {
			if (threeNumberArray[i % 3] >= 1 && threeNumberArray[i % 3] <= 6) {
				finalCode[i] = threeNumberArray[i % 3];
			}

		}
		resultMessage = "The code is " + Arrays.toString(finalCode);

		for (int i = 0; i < finalCode.length; i++) {
			if (finalCode[i] == 0) {
				resultMessage = "The code doesn't exist.";
				break;
			}
		}

		return resultMessage;
	}

}
