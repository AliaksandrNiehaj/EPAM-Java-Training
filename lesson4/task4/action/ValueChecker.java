package by.niakhai.lesson4.task4.action;

import by.niakhai.lesson4.task4.printer.Printer;

public class ValueChecker {
	
	public static boolean checkNumber(int number) {
		
		String str = "The number doesn't meet the conditions.";
		
		if (number >= 100_000 && number <= 999_999) {
			return true;
		} else {
			Printer.println(str);
			return false;
		}
	}
}