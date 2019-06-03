package by.epam.javatraining.niakhai.task1.controller;

import by.epam.javatraining.niakhai.task1.model.logic.Coin;
import by.epam.javatraining.niakhai.task1.view.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int times = 1000;
		int head = Coin.getHeads(times);
		int tail = Coin.getTails(head);
		
		Printer.println("heads: %d times.", head);
		Printer.println("tails: %d times.", tail);
	}
}