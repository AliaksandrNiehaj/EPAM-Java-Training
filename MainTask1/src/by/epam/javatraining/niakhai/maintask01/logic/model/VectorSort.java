package by.epam.javatraining.niakhai.maintask01.logic.model;

import by.epam.javatraining.niakhai.maintask01.view.Printer;

public class VectorSort {
	
	public static void reverseArray(int[] array) {
		
		int arraySize = array.length;
		
		if (arraySize <= 1) {
			return;
		}
		
		int temp;
		int counterLimit = array.length / 2;
		
		for (int i = 0; i < counterLimit; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;		
		}
		printArray(array);
	}
	
	public static int[] bubbleSort(int[] array) {

		int arraySize = array.length;

		if (arraySize <= 1) {
			return array;
		}

		int[] helpArray = array;
		int counterLimit = array.length - 1;

		int temp = 0;
		
		for (int i = 1; i < arraySize; i++) {
			for (int j = 0; j < counterLimit; j++) {
				if (helpArray[j] > helpArray[j+1]) {
					temp = helpArray[j];
					helpArray[j] = helpArray[j+1];
					helpArray[j+1] = temp;
				}
			}
		}
		printArray(array);
		return helpArray;
	}
	
	public static void insertionSort(int[] array) {
		
		int temp = 0;
		
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			int j = i;
			while (j > 0 && array[j-1] > temp) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
		}
		printArray(array);
	}
	
	public static void selectionSort(int[] array) {
		
		int temp = 0;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			index = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < temp) {
					temp = array[j];
					index = j;
				}
			}
			if (i != index) {
				int temp2 = array[i];
				array[i] = array[index];
				array[index] = temp2;
			}
		}
		printArray(array);
	}
	
	public static void quickSort(int[] array, int begin, int end) {
		
		if (begin < end) {
			int partitionIndex = partition(array, begin, end);
			
			quickSort(array, begin, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);
		}
        printArray(array);
	}
	
	private static int partition (int[] array, int begin, int end) {
		
		int pivot = array[end];
		int i = begin - 1;
		
		for (int j = 0; j < end; j++) {
			if (array[j] <= pivot) {
				i++;
				
				int swapTemp = array[i];
				array[i] = array[j];
				array[j] = swapTemp;
			}
		}
		
		int swapTemp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = swapTemp;
		
		return i + 1;
	}
	
	public static void printArray (int[] array) {
		
		String message = null;
		
		for (int x : array) {
			message = x + " ";
			Printer.print(message);
		}
		
		message = "\n";
		Printer.print(message);
	}
}