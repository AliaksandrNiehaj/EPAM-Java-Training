package by.niakhai.lesson4.task5.action;

import by.niakhai.lesson4.task5.printer.Printer;

public class NumberLogic {
	
	public static int invertNumber(int number) {
				
		if (checkNumber(number)) {
			
			String string = getSequence(number);
			return Integer.parseInt(string);
		}
		
		return 0;	
	}
	
	public static boolean checkNumber(int number) {
		
		String result = "The number doesn't meet the conditions.";
		
		if (number >= 1_000_000 && number <= 9_999_999) {
			return true;
		}
		
		Printer.println(result);
		return false;
	}
	
	public static String getSequence(int number) {
		
		String string = null;

		int first = number % 10;
		number /= 10;
				
		int second = number % 10;
		number /= 10;
				
		int third = number % 10;
		number /= 10;
				
		int fourth = number % 10;
		number /= 10;
				
		int fifth = number % 10;
		number /= 10;
				
		int six = number % 10;
		number /= 10;
				
		int seventh = number % 10;
				
		string = "" + first + second + third + fourth + fifth + six + seventh;
		
		return string;
	}
}