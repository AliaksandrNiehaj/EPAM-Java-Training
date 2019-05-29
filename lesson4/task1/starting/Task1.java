package by.niakhai.lesson4.task1.starting;

import by.niakhai.lesson4.task1.checking.NumberChecker;
import by.niakhai.lesson4.task1.printer.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int a = 3, b = 5, c = 4;
		String result = NumberChecker.compareNumbers(a, b, c);
		Printer.println(result);
		
		a = 1;
		b = 1;
		c = 1;
		result = NumberChecker.compareNumbers(a, b, c);
		Printer.println(result);
		
		a = 1;
		b = 1;
		c = 2;
		result = NumberChecker.compareNumbers(a, b, c);
		Printer.println(result);
		
		a = 1;
		b = 2;
		c = 1;
		result = NumberChecker.compareNumbers(a, b, c);
		Printer.println(result);
		
		a = 3;
		b = 1;
		c = 1;
		result = NumberChecker.compareNumbers(a, b, c);
		Printer.println(result);
	}
}