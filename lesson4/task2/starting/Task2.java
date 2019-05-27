package by.niakhai.lesson4.task2.starting;

import by.niakhai.lesson4.task2.action.RingLogic;
import by.niakhai.lesson4.task2.entity.Circle;
import by.niakhai.lesson4.task2.infoprinter.InfoPrinter;

public class Task2 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(1, 14.5);
		Circle circle2 = new Circle(2, 4.3);
		double ringSquare;
		
		ringSquare = RingLogic.getRingSquare(circle1, circle2);
		
		InfoPrinter.println(ringSquare);
	}
}