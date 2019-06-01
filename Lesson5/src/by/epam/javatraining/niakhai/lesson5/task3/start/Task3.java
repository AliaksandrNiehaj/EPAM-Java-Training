package by.epam.javatraining.niakhai.lesson5.task3.start;

import by.epam.javatraining.niakhai.lesson5.task3.printer.Printer;
import by.epam.javatraining.niakhai.lesson5.task3.action.NumberLog;

public class Task3 {

	public static void main(String[] args) {
		
		int a = NumberLog.generateNumber();
		String mood = NumberLog.getMood(a);	
		Printer.println(mood);
	}
}