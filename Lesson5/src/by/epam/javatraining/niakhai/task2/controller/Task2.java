package by.epam.javatraining.niakhai.task2.controller;

import by.epam.javatraining.niakhai.task2.model.logic.SymbolLogic;
import by.epam.javatraining.niakhai.task2.view.Printer;

public class Task2 {

	public static void main(String[] args) {
		
		String s = "a";
		
		String string = SymbolLogic.getSymbolInfo(s);
		
		Printer.println(string);
	}
}