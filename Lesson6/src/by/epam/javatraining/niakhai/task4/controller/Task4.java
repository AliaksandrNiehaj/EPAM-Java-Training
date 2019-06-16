package by.epam.javatraining.niakhai.task4.controller;

import by.epam.javatraining.niakhai.task4.model.logic.NumberChecker;
import by.epam.javatraining.niakhai.view.Printer;

public class Task4 {

	public static void main(String[] args) {
		
		int number = 123;
		boolean result = NumberChecker.isOdd(number);
		Printer.println(result);
		
		number = 224486402;
		result = NumberChecker.isEven(number);
		Printer.println(result);

		number = 139979795;
		result = NumberChecker.isEven(number);
		Printer.println(result);

		number = 260;
		result = NumberChecker.isOdd(number);
		Printer.println(result);
		
		number = 3515;
		result = NumberChecker.isOdd(number);
		Printer.println(result);
		
		number = 0;
		result = NumberChecker.isEven(number);
		Printer.println(result);
		
		number = 0;
		result = NumberChecker.isOdd(number);
		Printer.println(result);
	}
}