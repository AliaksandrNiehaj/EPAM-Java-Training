package by.niakhai.lesson4.task5.starting;

import by.niakhai.lesson4.task5.action.NumberLogic;
import by.niakhai.lesson4.task5.infoprinter.InfoPrinter;

public class Task5 {

	public static void main(String[] args) {
		
		int firstNumber = 2899884, invertedNumber;
		
		invertedNumber = NumberLogic.invertNumber(firstNumber);
		InfoPrinter.println(invertedNumber);
	}
}