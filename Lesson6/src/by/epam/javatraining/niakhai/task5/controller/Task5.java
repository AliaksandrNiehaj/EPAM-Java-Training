package by.epam.javatraining.niakhai.task5.controller;

import by.epam.javatraining.niakhai.task5.model.logic.NaturalNumber;
import by.epam.javatraining.niakhai.view.Printer;

public class Task5 {

	public static void main(String[] args) {
		
		int number = 0;
		boolean result = NaturalNumber.isNatural(number);
		Printer.println(result);
		
		number = -9;
		result = NaturalNumber.isNatural(number);
		Printer.println(result);
		

		number = 1;
		result = NaturalNumber.isNatural(number);
		Printer.println(result);
		
		number = 19;
		result = NaturalNumber.isNatural(number);
		Printer.println(result);
		
		number = 18;
		result = NaturalNumber.isNatural(number);
		Printer.println(result);
		
		number = 7;
		result = NaturalNumber.isNatural(number);
		Printer.println(result);
		
		number = 84;
		result = NaturalNumber.isNatural(number);
		Printer.println(result);
	}
}