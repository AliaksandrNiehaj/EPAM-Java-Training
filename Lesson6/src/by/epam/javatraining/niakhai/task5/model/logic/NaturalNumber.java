package by.epam.javatraining.niakhai.task5.model.logic;

public class NaturalNumber {
	
	public static boolean isNatural (int number) {
		
		if (NumberChecker.checkNumber(number)) {
			
			int counter = 2;
			
			while (counter < number) {
				
				if (number % counter == 0) {
					return false;
				}
				
				counter++;			
			}
		}
		
		return true;
	}
}