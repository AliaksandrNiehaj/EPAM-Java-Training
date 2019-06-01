package by.epam.javatraining.niakhai.lesson5.task2.start;

import by.epam.javatraining.niakhai.lesson5.task2.action.SymbolLogic;
import by.epam.javatraining.niakhai.lesson5.task2.printer.Printer;

public class Task2 {

	public static void main(String[] args) {
		
		String s = "a";
		
		String string = SymbolLogic.getSymbolInfo(s);
		
		Printer.println(string);
	}
}