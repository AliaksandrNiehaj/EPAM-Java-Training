package by.epam.javatraining.niakhai.maintask01.logic.model;

import static java.lang.Math.*;

public class VectorArithmetic {
	
	public static double middleArithmetic(int[] array) {
		
		int arraySize = array.length;
		double sum = 0.0;
		
		if (arraySize == 0) {
			return sum;
		} else if (arraySize == 1) {
			sum = array[0];
			return sum;
		}
		
		for (int i = 0; i < arraySize; i++) {
			sum += array[i];
		}
		
		double middleArithmetic = sum / arraySize;
		
		return middleArithmetic;
	}
	
	public static double middleGeometric(int[] array) {
		
		int arraySize = array.length;
		double mul = 1.0;
		
		if (arraySize <= 1) {
			mul = 0.0;
			return mul;
		}
		
		for (int i = 0; i < arraySize; i++) {
			mul *= array[i];
		}
		
		double power = 1.0 / array.length;
		double middleGeometric = pow(mul, power);
		
		return middleGeometric;
	}
}