package by.epam.javatraining.niakhai.task3.model.logic;

public class Factorial {
	
	public static long getFactorial(int number) {

		int factorial = 1;
		
		if (NumberChecker.checkNumber(number)) {
			
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
		}
		
		return factorial;
	}
}