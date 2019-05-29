package by.niakhai.lesson4.task4.starting;

import by.niakhai.lesson4.task4.action.NumberLogic;

public class Task4 {

	public static void main(String[] args) {
		
		int number = 184565;
		double DIGITS = 6.0;
		
		NumberLogic.getMiddleArithmetic(number, DIGITS);
		NumberLogic.getMiddleGeometric(number, DIGITS);
		
		number = -8829;
		
		NumberLogic.getMiddleArithmetic(number, DIGITS);
		NumberLogic.getMiddleGeometric(number, DIGITS);

	}
}