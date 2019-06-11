package by.epam.javatraining.niakhai.maintask01.logic.model;

import static java.lang.Math.*;

public class VectorLogic {
	
	public static int maxValue(int[] array) {
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int minValue(int[] array) {
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double middleArithmetic(int[] array) {
		int arraySize = array.length;
		double sum = 0.0, middleArithmetic;
		
		for (int i = 0; i < arraySize; i++) {
			sum += array[i];
		}
		
		middleArithmetic = sum / arraySize;
		
		return middleArithmetic;
	}
	
	public static double middleGeometric(int[] array) {
		int arraySize = array.length;
		double mul = 1.0, middleGeometric, power;
		
		for (int i = 0; i < arraySize; i++) {
			mul *= array[i];
		}
		
		power = 1.0 / array.length;
		middleGeometric = pow(mul, power);
		
		return middleGeometric;
	}
	
	public static boolean isSequence(int[] array) {
		boolean flag = false;
		
		for (int i = 0; i < array.length - 2; i++) {
			if ((array[i] < array[i+1] && array[i+1] < array[i+2])
					|| (array[i] > array[i+1] && array[i+1] > array[i+2])) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public static int firstLocalMin(int[] array) {
		
		int localMin = 0;
		
		for (int i = 1; i < array.length - 1; i++) {

			if (array[i-1] > array[i] && array[i] < array[i+1]) {
				localMin = i;
				i = 4;
			} else if(array[i-1] > array[i+1]) {
				localMin = i+1;
				i = 4;
			} else {
				localMin = i-1;
				i = 4;
			}
		}
		return localMin;
	}
	
	public static int firstLocalMax(int[] array) {
		
		int localMax = 0;
		
		for (int i = 1; i < array.length - 1; i++) {

			if (array[i-1] < array[i] && array[i] > array[i+1]) {
				localMax = i;
				i = 4;
			} else if(array[i-1] < array[i+1]) {
				localMax = i+1;
				i = 4;
			} else {
				localMax = i-1;
				i = 4;
			}
		}
		return localMax;
	}
	
	public static int[] reverseArray(int[] array) {
		
		for (int i = 0; i < array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		}

		return array;
	}
	
	public static int linearSearch(int search, int[] array) {
		
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static int[] bubbleSorting(int[] array) {
		
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) {
		
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
		
		return array;
	}
	
	public static int[] selectionSort(int[] array) {
		
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
		
		return array;
	}
	
	public static int[] quickSort(int[] array, int startIndex, int endIndex) {
		
		int pivotValue = array.length-1;
		int currentStartIndex = startIndex;
		int currentEndIndex = endIndex;
		
		while (currentStartIndex < currentEndIndex) {
			
			while(array[currentStartIndex] < pivotValue) {
				currentStartIndex++;
			}
			while((array[currentEndIndex] > pivotValue) && (currentEndIndex > currentStartIndex)) {
				currentEndIndex--;
			}
			if(currentStartIndex < currentEndIndex) {
				int temp = array[currentStartIndex];
				array[currentStartIndex] = array[currentEndIndex];
				array[currentEndIndex] = temp;
				if(currentEndIndex - currentStartIndex > 1) {
					currentStartIndex++;
					currentEndIndex--;
				} else {
					break;
				}
			}
		}
		
		if ((currentStartIndex > startIndex) && (currentStartIndex - startIndex > 1)) {
			quickSort(array, startIndex, currentStartIndex);			
		}
		
        if ((endIndex > currentEndIndex) && (endIndex - currentEndIndex > 1)) {
        	quickSort(array, currentEndIndex , endIndex);        	
        }
        
        return array;
	}
}