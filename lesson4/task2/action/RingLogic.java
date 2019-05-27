package by.niakhai.lesson4.task2.action;

import by.niakhai.lesson4.task2.entity.Circle;

public class RingLogic {
	
	public static double getRingSquare(Circle a, Circle b) {
		
		if (ValueChecker.checkValues(a, b)) {
			return a.getSquare() - b.getSquare();
		} else {
			return -1;
		}
		
	}
}