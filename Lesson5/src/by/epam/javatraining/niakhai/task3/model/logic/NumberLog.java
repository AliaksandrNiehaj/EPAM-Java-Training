package by.epam.javatraining.niakhai.task3.model.logic;

import java.util.Random;

public class NumberLog {
	
	public static int generateNumber() {
		
		Random random = new Random();
		int a = random.nextInt(100);
		return a;
	}
	
	public static String getMood(int a) {
		
		String result = "Illegal number";
		
		if (a >= 0 && a <= 33) {
			result = ":(";
		} else if (a > 33 && a <= 70) {
			result = ":|";
		} else if (a > 70 && a <= 100) {
			result = ":)";
		}
		return result;
	}
}