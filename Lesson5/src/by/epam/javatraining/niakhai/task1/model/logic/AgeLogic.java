package by.epam.javatraining.niakhai.task1.model.logic;

import by.epam.javatraining.niakhai.task1.view.Printer;

public class AgeLogic {
	
	public static int getDragonHeads(int age) {
		
		int head = 0;
		
		int beginAge = 0;
		int firstCicleBegin = 1, firstCicleEnd = 200;
		int secondCicleBegin = 201, secondCicleEnd = 300;
		int thirdCicleBegin = 301;
		
		if (age == beginAge) {
			
			head = 3;
			
		} else if (age >= firstCicleBegin && age <= firstCicleEnd) {
			
			head = (age + 1) * 3;
			
		} else if (age >= secondCicleBegin && age <= secondCicleEnd) {
			
			head = (age - firstCicleEnd) * 2 + 603;
			
		} else if (age >= thirdCicleBegin) {
			
			head = age - secondCicleEnd + 803;
			
		} else {
			Printer.print("Illegal data.");
		}
		
		return head;
	}

	public static int getDragonEyes(int head) {
		
		return head * 2;
	}	
}