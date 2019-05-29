package by.niakhai.lesson4.task2.starting;

import by.niakhai.lesson4.task2.action.RingLogic;
import by.niakhai.lesson4.task2.entity.Circle;
import by.niakhai.lesson4.task2.printer.Printer;

public class Task2 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(1, 14.5);
		Circle circle2 = new Circle(2, 10.0);
		double ringSquare = RingLogic.getRingSquare(circle1, circle2);
		
		Printer.println("Ring square is", ringSquare);
	}
}