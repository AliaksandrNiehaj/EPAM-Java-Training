package by.niakhai.lesson4.task3.action;

public class NumberParsing {
	
	public static String getSequence(int number) {

		NumberLogic nl = new NumberLogic();
		
		int first = getLastDigit(number);
		number = removeLastDigit(number);
		
		int second = getLastDigit(number);
		number = removeLastDigit(number);
		
		int third = getLastDigit(number);
		number = removeLastDigit(number);
		
		int fourth = getLastDigit(number);
		
		return nl.identifySequence(fourth, third, second, first);
	}
	
	public static int getLastDigit(int number) {
		return number % 10;
	}
	
	public static int removeLastDigit(int number) {
		return number /= 10;
	}
}