package by.epam.javatraining.niakhai.task1.controller;

import by.epam.javatraining.niakhai.task1.model.logic.AgeLogic;
import by.epam.javatraining.niakhai.task1.view.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int age = 4;
		
		String result = "Dragon has %d heads and %d eyes.";
		int head = AgeLogic.getDragonHeads(age);
		int eyes = AgeLogic.getDragonEyes(head);
		
		Printer.println(result, head, eyes);
	}
}