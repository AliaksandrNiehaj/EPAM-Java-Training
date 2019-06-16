package by.epam.javatraining.niakhai.task3.model.logic;

public class Factorial {
	
	public static long getFactorial(int number) {

		int factorial = 1;
		
		if (number == 0) {
			return factorial;
		} else if (number < 0) {
			number *= -1;
		}
		
		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
}