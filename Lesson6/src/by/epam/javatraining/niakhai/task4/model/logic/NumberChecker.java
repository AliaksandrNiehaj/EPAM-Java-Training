package by.epam.javatraining.niakhai.task4.model.logic;

public class NumberChecker {
	
	public static String getInfo(int number) {
		
		String result = "All numbers are different.";
		
		if (isEven(number)) {
			result = "All numbers are even.";
		} else if (isOdd(number)) {
			result = "All numbers are odd.";
		}
		
		return result;
	}	
	
	public static boolean isEven(int number) {
		
		while (number != 0) {
			
			int temp = number % 10;
			
			if (temp % 2 != 0) {
				return false;
			}
			
			number /= 10;
		}
		
		return true;
	}
	
	public static boolean isOdd(int number) {
		
		while (number != 0) {
			
			int temp = number % 10;
			
			if (temp % 2 == 0) {
				return false;
			}
			
			number /= 10;
		}
		
		return true;
	}
}