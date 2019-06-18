package by.epam.javatraining.niakhai.maintask01.logic.model;

public class VectorSearch {
	
	public static int maxValue(int[] array) {
		
		int arraySize = array.length;
		int max = 0;
		
		if (arraySize <= 0) {
			return max;
		} else if (arraySize == 1) {
			max = array[0];
			return max;
		}
		
		max = array[0];
		
		for (int i = 1; i < arraySize; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int minValue(int[] array) {
		
		int arraySize = array.length;
		int min = 0;
		
		if (arraySize <= 0) {
			return min;
		} else if (arraySize == 1) {
			min = array[0];
			return min;
		}
		
		min = array[0];
		
		for (int i = 1; i < arraySize; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int firstLocalMin(int[] array) {
		
		int arraySize = array.length;
		int localMin = 0;
		
		if (arraySize <= 1) {
			return localMin;
		}
		
		if (arraySize == 2) {
			if(array[0] < array[1] || array[0] == array[1]) {
				return localMin;
			} else {
				localMin = 1;
				return localMin;
			}
		}
		
		int counterLimit = array.length - 1;
		
		for (int i = 1; i < counterLimit; i++) {

			if (array[i-1] > array[i] && array[i] < array[i+1]) {
				localMin = i;
				i = arraySize;
			} else if(array[i-1] > array[i+1]) {
				localMin = i+1;
				i = arraySize;
			} else {
				localMin = i-1;
				i = arraySize;
			}
		}
		return localMin;
	}
	
	public static int firstLocalMax(int[] array) {
		
		int arraySize = array.length;
		int localMax = 0;
		
		if (arraySize <= 1) {
			return localMax;
		} 
		
		if (arraySize == 2) {
			if(array[0] > array[1] || array[0] == array[1]) {
				return localMax;
			} else {
				localMax = 1;
				return localMax;
			}
		}
		
		int counterLimit = array.length - 1;
		
		for (int i = 1; i < counterLimit; i++) {

			if (array[i-1] < array[i] && array[i] > array[i+1]) {
				localMax = i;
				i = arraySize;
			} else if(array[i-1] < array[i+1]) {
				localMax = i+1;
				i = arraySize;
			} else {
				localMax = i-1;
				i = arraySize;
			}
		}
		return localMax;
	}
	
	public static int linearSearch(int search, int[] array) {
		
		int arraySize = array.length;
		int index = 0;
		
		if (arraySize <= 1) {
			return index;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static int bynarySearch(int search, int[] array, int start, int end) {
		
		
		int index = 0;
		int arraySize = array.length;
		
		if (arraySize <= 1) {
			return index;
		}
		
		int middle = (start + end) / 2;
		
		for (int i = 0; i < middle; i++) {
			if (array[middle] == search) {
				index = i;
				return index;
			} else {
				if (array[middle] < search) {
					middle--;
				} else if (array[middle] > search) {
					middle++;
				}
			}
		}
		return index;
	}
}