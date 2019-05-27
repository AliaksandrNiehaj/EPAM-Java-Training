package by.niakhai.lesson4.task3.action;

import by.niakhai.lesson4.task3.infoprinter.InfoPrinter;

public class ValueChecker {
	
	public static String checkNumber(int number) {
		
		
		String result = "The number doesn't meet the conditions.";
		
		if (number >= 1000 && number <= 9999) {
			result = NumberParsing.getSequence(number);
			InfoPrinter.println(result);
		} else {
			InfoPrinter.println(result);
		}
		
		return result;
	}

}
