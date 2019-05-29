package by.niakhai.lesson4.task3.action;

public class NumberLogic {
	
	public static String getSequence (int number) {
		
		String str = "The number doesn't meet the conditions.";
		
		if (checkNumber(number)) {
			str = identifySequence(number);
		}
		
		return str;
	}
		
	
	public static boolean checkNumber(int number) {
		
		if (number >= 1000 && number <= 9999) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static String identifySequence(int number) {
		
		int first = getLastDigit(number);
		number /= 10;
		
		int second = getLastDigit(number);
		number /= 10;
		
		int third = getLastDigit(number);
		number /= 10;
		
		int fourth = getLastDigit(number);
		
		return analizeDigits(fourth, third, second, first);
	}
	
	
	public static int getLastDigit(int number) {
		return number % 10;
	}
	
	
	private static String analizeDigits(int first, int second, int third, int fourth) {
		
		String string = "Numbers are not consistant.";

		if (first < second && second < third && third < fourth) {
			string = "Increasing sequence of numbers.";
		} else if (first > second && second > third && third > fourth) {
			string = "Decreasing sequence of numbers.";
		}
		
		return string;
	}
}