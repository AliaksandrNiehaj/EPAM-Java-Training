package by.epam.javatraining.niakhai.task4.model.logic;

public class NumberChecker {
	
	public static boolean isEven(int number) {
		
		int temp;
		boolean flag = false;
		
		if (number == 0) {
			flag = true;
			return flag;
		}
		
		while (number != 0) {
			temp = number % 10;
			
			if (temp % 2 != 0) {
				return flag;
			}
			number /= 10;
			flag = true;
		}	
		return flag;
	}
	
	public static boolean isOdd(int number) {
		int temp;
		boolean flag = false;
		
		if (number == 0) {
			return flag;
		}
		
		while (number != 0) {
			temp = number % 10;
			
			if (temp % 2 == 0) {
				return flag;
			}
			number /= 10;
		}
		flag = true;
		return flag;
	}
}