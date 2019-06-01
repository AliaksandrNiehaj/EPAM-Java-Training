package by.epam.javatraining.niakhai.task3.controller;

import by.epam.javatraining.niakhai.task3.model.logic.NumberLog;
import by.epam.javatraining.niakhai.task3.view.Printer;

public class Task3 {

	public static void main(String[] args) {
		
		int a = NumberLog.generateNumber();
		String mood = NumberLog.getMood(a);	
		Printer.println(mood);
	}
}