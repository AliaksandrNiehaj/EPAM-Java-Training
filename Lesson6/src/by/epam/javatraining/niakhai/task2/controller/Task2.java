package by.epam.javatraining.niakhai.task2.controller;

import by.epam.javatraining.niakhai.task2.model.logic.Sequence;
import by.epam.javatraining.niakhai.task2.view.Printer;

public class Task2 {

	public static void main(String[] args) {
		
		String sequenceInfo = Sequence.getSequenceInfo(1357);
		Printer.println(sequenceInfo);
		
		sequenceInfo = Sequence.getSequenceInfo(98765);
		Printer.println(sequenceInfo);
		
		sequenceInfo = Sequence.getSequenceInfo(192837);
		Printer.println(sequenceInfo);
		
		sequenceInfo = Sequence.getSequenceInfo(777);
		Printer.println(sequenceInfo);
		
		sequenceInfo = Sequence.getSequenceInfo(19283746);
		Printer.println(sequenceInfo);
	}
}