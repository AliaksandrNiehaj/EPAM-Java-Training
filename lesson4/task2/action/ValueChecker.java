package by.niakhai.lesson4.task2.action;

import by.niakhai.lesson4.task2.entity.Circle;

public class ValueChecker {
	
	public static boolean checkValues(Circle circle1, Circle circle2) {
		
		if (circle1.getNumber() < circle2.getNumber()
				&& circle1.getRadius() > circle2.getRadius()) {
			return true;
		}
		
		return false;
	}
}