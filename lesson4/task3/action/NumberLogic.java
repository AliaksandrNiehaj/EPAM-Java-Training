package by.niakhai.lesson4.task3.action;

public class NumberLogic {
	
	public String identifySequence (int first, int second, int third, int fourth) {
		
		String string;

		if (first < second && second < third && third < fourth) {
			string = "Increasing sequence of numbers.";
		} else if (first > second && second > third && third > fourth) {
			string = "Decreasing sequence of numbers.";
		} else {
			string = "Numbers are not consistant.";
		}
		
		return string;
	}
}