package by.epam.javatraining.niakhai.lesson5.task1.start;

import by.epam.javatraining.niakhai.lesson5.task1.action.AgeLogic;
import by.epam.javatraining.niakhai.lesson5.task1.printer.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int age = 4;
		
		String result = "Dragon has %d heads and %d eyes.";
		int head = AgeLogic.getDragonHeads(age);
		int eyes = AgeLogic.getDragonEyes(head);
		
		Printer.println(result, head, eyes);
	}
}