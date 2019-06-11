package by.epam.javatraining.niakhai.maintask01.controller;

import java.util.Arrays;

import by.epam.javatraining.niakhai.maintask01.logic.model.VectorLogic;
import by.epam.javatraining.niakhai.maintask01.view.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		array[0] = 3;
		array[1] = 10;
		array[2] = 65;
		array[3] = 8;
		array[4] = 51;
		
		
		int max = VectorLogic.maxValue(array);
		Printer.println("Maximal array value is %d.", max);
		
		int min = VectorLogic.minValue(array);
		Printer.println("Minimal array value is %d.", min);
		
		double middleArithmetic = VectorLogic.middleArithmetic(array);
		Printer.println("Middle arithmetic is %.2f.", middleArithmetic);
		
		double middleGeometric = VectorLogic.middleGeometric(array);
		Printer.println("Middle geometric is %.3f.", middleGeometric);
		
		boolean isSequence = VectorLogic.isSequence(array);
		Printer.println("Array numbers are sequence - it's %b.", isSequence);
		
		int firstLocalMin = VectorLogic.firstLocalMin(array);
		Printer.println("First local minimum index is %d.", firstLocalMin);
		
		int firstLocalMax = VectorLogic.firstLocalMax(array);
		Printer.println("First local maximum index is %d.", firstLocalMax);
		
		array = VectorLogic.reverseArray(array);
		Printer.println("Reversed array", array);
		
		int search = 10;
		int index = VectorLogic.linearSearch(search, array);
		Printer.println("Linear search: the index of %d in array is %d.", search, index);
		
		array = VectorLogic.bubbleSorting(array);
		Printer.println("Bubble sorted", array);
		
		array = VectorLogic.insertionSort(array);
		Printer.println("Insertion sort", array);
		
		array = VectorLogic.selectionSort(array);
		Printer.println("Insertion sort", array);
		
		array = VectorLogic.quickSort(array, 0, array.length-1);
		Printer.println("Quick sort", array);
		
	}

}
