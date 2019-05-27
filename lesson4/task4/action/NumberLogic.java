package by.niakhai.lesson4.task4.action;

import by.niakhai.lesson4.task4.printer.Printer;

public class NumberLogic {
	
	public static double getMiddleArithmetic(int number) {
		
		double middleArithmetic = 0;
		
		if (ValueChecker.checkNumber(number)) {
			
			int first = getLastDigit(number);
			number = removeLastDigit(number);
			
			int second = getLastDigit(number);
			number = removeLastDigit(number);
			
			int third = getLastDigit(number);
			number = removeLastDigit(number);
			
			int fourth = getLastDigit(number);
			number = removeLastDigit(number);
			
			int fifth = getLastDigit(number);
			number = removeLastDigit(number);
			
			int six = getLastDigit(number);
			
			middleArithmetic = (double)(first + second + third + fourth + fifth + six) / 6;
			Printer.println(middleArithmetic);
			
			return middleArithmetic;
		}
		
		return middleArithmetic;
	}
	
	public static double getMiddleGeometric(int number) {
		
		double middleGeometric = 0;
		
		if (ValueChecker.checkNumber(number)) {
			
			int first = getLastDigit(number);
			number = removeLastDigit(number);
			
			int second = getLastDigit(number);
			number = removeLastDigit(number);
			
			int third = getLastDigit(number);
			number = removeLastDigit(number);
			
			int fourth = getLastDigit(number);
			number = removeLastDigit(number);
			
			int fifth = getLastDigit(number);
			number = removeLastDigit(number);
			
			int six = getLastDigit(number);
			
			middleGeometric = (double)(Math.pow((first * second * third * fourth * fifth * six), 1.0 / 6));
			Printer.println(middleGeometric);
			
			return middleGeometric;
		}
		
		return middleGeometric;
		
	}

	public static int getLastDigit(int number) {
		return number % 10;
	}

	public static int removeLastDigit(int number) {
		return number /= 10;
	}
}