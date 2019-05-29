package by.niakhai.lesson4.task4.action;

import static java.lang.Math.pow;
import by.niakhai.lesson4.task4.printer.Printer;

public class NumberLogic {
	
	public static double getMiddleArithmetic(int number, double number2) {
		
		double middleArithmetic = 0;
		
		if (checkNumber(number)) {
			
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
			
			middleArithmetic = (first + second + third + fourth + fifth + six) / number2;
			Printer.printf("The middle arithmetic is %.2f.\n", middleArithmetic);
			
			return middleArithmetic;
		}
		
		return middleArithmetic;
	}
	
	public static double getMiddleGeometric(int number, double number2) {
		
		double middleGeometric = 0;
		
		if (checkNumber(number)) {
			
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
			
			middleGeometric = pow((first * second * third * fourth * fifth * six), 1.0 / number2);	
			Printer.printf("The middle geometric is %.2f.\n", middleGeometric);
			
			return middleGeometric;
		}
		
		return middleGeometric;
		
	}
	
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