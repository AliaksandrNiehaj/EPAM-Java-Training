package by.niakhai.lesson4.task5.starting;

import by.niakhai.lesson4.task5.action.NumberLogic;
import by.niakhai.lesson4.task5.printer.Printer;

public class Task5 {

	public static void main(String[] args) {
		
		int firstNumber = 2899884;
		int invertedNumber = NumberLogic.invertNumber(firstNumber);
		Printer.println("Inverted number is:",invertedNumber);
	}
}