package by.epam.javatraining.niakhai.task5.view;

public class Printer {
	
	public static void println(boolean bool, int number) {
		if (bool) {
			System.out.printf("The number %d is natural.\n", number);
		} else {
			System.out.printf("The number %d is not natural.\n", number);
		}
	}
}