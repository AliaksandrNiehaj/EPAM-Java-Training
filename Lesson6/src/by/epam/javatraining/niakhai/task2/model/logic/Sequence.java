package by.epam.javatraining.niakhai.task2.model.logic;

public class Sequence {
	
	public static String getSequenceInfo(int number) {
		
		String result = "Is not sequence.";
		
		if (Sequence.isIncreaseSequence(number)) {
			result = "Is increase sequence.";
		} else if (Sequence.isDecreaseSequence(number)) {
			result = "Is decrease sequence.";
		}
		
		return result;
	}
	
	public static boolean isIncreaseSequence(int number) {
				
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