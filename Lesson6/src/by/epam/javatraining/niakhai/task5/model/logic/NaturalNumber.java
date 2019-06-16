package by.epam.javatraining.niakhai.task5.model.logic;

public class NaturalNumber {
	
	public static boolean isNatural (int number) {
		
		boolean result = false;
		
		if (number <= 0) {
			return result;
		} else if (number == 1) {
			result = true;
			return result;
		}
		
		int counter = 2;
		int counterLimit = number / 2;
		
		while (counter < counterLimit) {
			
			if (number % counter == 0) {
				return result;
			}
			counter++;			
		}
		result = true;
		return result;
	}
}