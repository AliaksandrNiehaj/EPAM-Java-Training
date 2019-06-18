package by.epam.javatraining.niakhai.maintask01.controller;

import by.epam.javatraining.niakhai.maintask01.logic.model.VectorArithmetic;
import by.epam.javatraining.niakhai.maintask01.logic.model.VectorLogic;
import by.epam.javatraining.niakhai.maintask01.logic.model.VectorSearch;
import by.epam.javatraining.niakhai.maintask01.logic.model.VectorSort;
import by.epam.javatraining.niakhai.maintask01.view.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		array[0] = 10;
		array[1] = 3;
		array[2] = 8;
		array[3] = 65;
		array[4] = 51;
		array[5] = 47;
		array[6] = 71;
		array[7] = 12;
		array[8] = 5;
		array[9] = 4;
		
		
		int max = VectorSearch.maxValue(array);
		String message = "Maximal array value is " + max + ".\n";
		Printer.print(message);
		
		int min = VectorSearch.minValue(array);
		message = "Minimal array value is " + min + ".\n";
		Printer.print(message);
	
		double middleArithmetic = VectorArithmetic.middleArithmetic(array);
		message = "Middle arithmetic is " + middleArithmetic + ".\n";
		Printer.print(message);
		
		double middleGeometric = VectorArithmetic.middleGeometric(array);
		message = "Middle geometric is " + middleGeometric + ".\n";
		Printer.print(message);
			
		boolean isSequence = VectorLogic.isSequence(array);
		message = "Array numbers are sequence: it's " + isSequence + ".\n";
		Printer.print(message);
		
		int firstLocalMin = VectorSearch.firstLocalMin(array);
		message = "First local minimum index is " + firstLocalMin + ".\n";
		Printer.print(message);
		
		int firstLocalMax = VectorSearch.firstLocalMax(array);
		message = "First local maximum index is " + firstLocalMax + ".\n";
		Printer.print(message);
		
		int search = 5;
		int index = VectorSearch.linearSearch(search, array);
		message = "Linear search: the index of " + search + " in array is " + index + ".\n";
		Printer.print(message);
		
		VectorSort.reverseArray(array);
		
		int[] helpArray = VectorSort.bubbleSort(array);
		search = 3;
		index = VectorSearch.bynarySearch(search, helpArray, 0, helpArray.length - 1);
		message = "Binary search: the index of " + search + " in array is " + index + ".\n";
		Printer.print(message);
		
		VectorSort.insertionSort(array);
		VectorSort.selectionSort(array);
		VectorSort.quickSort(array, 0, array.length - 1);
	}
}