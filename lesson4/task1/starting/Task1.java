package by.niakhai.lesson4.task1.starting;

import by.niakhai.lesson4.task1.checking.NumberChecker;
import by.niakhai.lesson4.task1.infoprinter.InfoPrinter;

public class Task1 {

	public static void main(String[] args) {
		
		NumberChecker numberChecker = new NumberChecker();
		int a, b, c;
		boolean sign;
		
		a = 3;
		b = 4;
		c = 5;
		sign = numberChecker.checkNumbers(a, b, c);
		InfoPrinter.getInfo(sign);
		
		a = 9;
		b = 9;
		c = 9;
		sign = numberChecker.checkNumbers(a, b, c);
		InfoPrinter.getInfo(sign);
	}
}