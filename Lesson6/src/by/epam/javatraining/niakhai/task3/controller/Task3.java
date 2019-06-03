package by.epam.javatraining.niakhai.task3.controller;

import by.epam.javatraining.niakhai.task3.model.logic.Factorial;
import by.epam.javatraining.niakhai.task3.view.Printer;

public class Task3 {

	public static void main(String[] args) {
		
		int number = 3;
		long factorial = Factorial.getFactorial(number);
		Printer.println("The facorial of %d is %d.", number, factorial);
		
		number = 7;
		factorial = Factorial.getFactorial(number);
		Printer.println("The facorial of %d is %d.", number, factorial);
		
		number = 0;
		factorial = Factorial.getFactorial(number);
		Printer.println("The facorial of %d is %d.", number, factorial);
		
		number = 1;
		factorial = Factorial.getFactorial(number);
		Printer.println("The facorial of %d is %d.", number, factorial);
		
		number = 16;
		factorial = Factorial.getFactorial(number);
		Printer.println("The facorial of %d is %d.", number, factorial);
	}
}