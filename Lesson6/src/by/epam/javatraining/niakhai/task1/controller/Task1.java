package by.epam.javatraining.niakhai.task1.controller;

import by.epam.javatraining.niakhai.task1.model.logic.Coin;
import by.epam.javatraining.niakhai.view.Printer;

public class Task1 {

	public static void main(String[] args) {
		
		int times = 50;
		
		int head = Coin.calcHeads(times);
		int tail = Coin.calcTails(times, head);
		
		String message1 = "Heads: " + head + ".\n";
		String message2 = "Tails: " + tail + ".\n";
		
		Printer.println(message1);
		Printer.println(message2);
	}
}