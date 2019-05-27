package by.niakhai.lesson4.task5.action;

import by.niakhai.lesson4.task5.infoprinter.InfoPrinter;

public class ValueChecker {
	
	public static int checkNumber(int number) {
		
		int invNumber = 0;
		
		String result = "The number doesn't meet the conditions.";
		
		if (number >= 1000000 && number <= 9999999) {
			invNumber = NumberParsing.getSequence(number);
		} else {
			InfoPrinter.println(result);
		}
		
		return invNumber;
	}

}
