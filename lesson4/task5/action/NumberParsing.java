package by.niakhai.lesson4.task5.action;

public class NumberParsing {
	
	public static int getSequence(int number) {
		
		String string = null;

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
		number = removeLastDigit(number);
				
		int seventh = getLastDigit(number);
				
		string = Integer.toString(first)+Integer.toString(second)+Integer.toString(third)+Integer.toString(fourth)+Integer.toString(fifth)+Integer.toString(six)+Integer.toString(seventh);
		
		return Integer.parseInt(string);
	}
	
	public static int getLastDigit(int number) {
		return number % 10;
	}
	
	public static int removeLastDigit(int number) {
		return number /= 10;
	}
}