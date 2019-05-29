package by.niakhai.lesson4.task3.starting;

import by.niakhai.lesson4.task3.action.NumberLogic;
import by.niakhai.lesson4.task3.printer.Printer;

public class Task3 {

	public static void main(String[] args) {
		
		int firstNumber = 1479;
		int secondNumber = 9631;
		int thirdNumber = 9367;
		int fourthNumber = -432;
		
		String firstSequence = NumberLogic.getSequence(firstNumber);
		Printer.println(firstSequence);
		
		String secondSequence = NumberLogic.getSequence(secondNumber);
		Printer.println(secondSequence);
		
		String thirdSequence = NumberLogic.getSequence(thirdNumber);
		Printer.println(thirdSequence);
		
		String fourthSequence = NumberLogic.getSequence(fourthNumber);
		Printer.println(fourthSequence);
	}
}