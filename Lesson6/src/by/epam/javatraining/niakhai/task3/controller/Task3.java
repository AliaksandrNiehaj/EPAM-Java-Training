package by.epam.javatraining.niakhai.task3.controller;

import by.epam.javatraining.niakhai.task3.model.logic.Factorial;
import by.epam.javatraining.niakhai.view.Printer;

public class Task3 {

	public static void main(String[] args) {
		
		int number = 0;
		long factorial = Factorial.getFactorial(number);
		String message = "The facorial of " + number + " is " + factorial + ".\n";
		Printer.println(message);		

		number = 1;
		factorial = Factorial.getFactorial(number);
		message = "The facorial of " + number + " is " + factorial + ".\n";
		Printer.println(message);
		
		number = 3;
		factorial = Factorial.getFactorial(number);
		message = "The facorial of " + number + " is " + factorial + ".\n";
		Printer.println(message);
				
		number = -7;
		factorial = Factorial.getFactorial(number);
		message = "The facorial of " + number + " is " + factorial + ".\n";
		Printer.println(message);
				
				
		number = 16;
		factorial = Factorial.getFactorial(number);
		message = "The facorial of " + number + " is " + factorial + ".\n";
		Printer.println(message);
	}
}