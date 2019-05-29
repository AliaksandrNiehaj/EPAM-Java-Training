package by.niakhai.lesson4.task1.checking;

public class NumberChecker {
	
	public static String compareNumbers(int a, int b, int c) {
		
		String result = "All numbers are different.";
		
		if (a == b && b == c) {
			result = "All numbers are the same.";
		} else if (a == b && a != c) {
			result = "\"a\" and \"b\" are the same, but \"c\" is different.";
		} else if (a == c && a != b) {
			result = "\"a\" and \"c\" are the same, but \"b\" is different.";
		} else if (b == c && a != b) {
			result = "\"b\" and \"c\" are the same, but \"a\" is different.";
		}
		
		return result;
	}
}