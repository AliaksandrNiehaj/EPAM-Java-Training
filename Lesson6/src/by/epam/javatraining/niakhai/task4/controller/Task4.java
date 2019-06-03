package by.epam.javatraining.niakhai.task4.controller;

import by.epam.javatraining.niakhai.task4.model.logic.NumberChecker;
import by.epam.javatraining.niakhai.task4.view.Printer;

public class Task4 {

	public static void main(String[] args) {
		
		int number = 123;
		Printer.println(NumberChecker.getInfo(number));
		
		number = 224486402;
		Printer.println(NumberChecker.getInfo(number));
		
		number = 139979795;
		Printer.println(NumberChecker.getInfo(number));
	}
}