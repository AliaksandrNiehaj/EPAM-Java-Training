package by.epam.javatraining.niakhai.task2.controller;

import by.epam.javatraining.niakhai.task2.model.logic.Sequence;
import by.epam.javatraining.niakhai.view.Printer;

public class Task2 {

	public static void main(String[] args) {
		
		boolean isSequence = Sequence.isIncreaseSequence(1357);
		Printer.println(isSequence);
		
		isSequence = Sequence.isDecreaseSequence(98765);
		Printer.println(isSequence);
		
		isSequence = Sequence.isIncreaseSequence(192837);
		Printer.println(isSequence);
		isSequence = Sequence.isDecreaseSequence(192837);
		Printer.println(isSequence);
		
		isSequence = Sequence.isIncreaseSequence(777);
		Printer.println(isSequence);
		isSequence = Sequence.isDecreaseSequence(777);
		Printer.println(isSequence);
		
		isSequence = Sequence.isIncreaseSequence(19283746);
		Printer.println(isSequence);
		isSequence = Sequence.isDecreaseSequence(19283746);
		Printer.println(isSequence);
	}
}