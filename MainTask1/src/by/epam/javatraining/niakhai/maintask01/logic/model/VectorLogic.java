package by.epam.javatraining.niakhai.maintask01.logic.model;

public class VectorLogic {
	
	public static boolean isSequence(int[] array) {
		
		int arraySize = array.length;
		boolean flag = false;
		
		if (arraySize <= 1) {
			return flag;
		}
		
		int counterLimit = array.length - 2;
		
		for (int i = 0; i < counterLimit; i++) {
			
			if ((array[i] < array[i + 1] && array[i + 1] < array[i + 2])
					|| (array[i] > array[i + 1] && array[i + 1] > array[i + 2])) {
				
				flag = true;
				
			} else {
				return flag;
			}
		}
		return flag;
	}
}