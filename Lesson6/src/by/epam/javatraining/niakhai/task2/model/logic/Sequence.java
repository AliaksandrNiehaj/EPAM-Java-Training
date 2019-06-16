package by.epam.javatraining.niakhai.task2.model.logic;

public class Sequence {
	
	public static boolean isIncreaseSequence(int number) {
		boolean flag = false;
		
		if(number < 10 && number >-10) {
			return flag;
		}
		
		if(number <= -10) {
			number *= -1;
		}
				
		while (number > 10) {
			
			int temp1 = number % 10;
			number /= 10;
			int temp2 = number % 10;
			
			if (temp1 == temp2 || temp1 < temp2) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDecreaseSequence(int number) {
		boolean flag = false;
		
		if(number < 10 && number >-10) {
			return flag;
		}
		
		if(number <= -10) {
			number *= -1;
		}
		
		while (number > 10) {
			
			int temp1 = number % 10;
			number /= 10;
			int temp2 = number % 10;
			
			if (temp1 == temp2 || temp1 > temp2) {
				return false;
			}
		}
		return true;
	}
}