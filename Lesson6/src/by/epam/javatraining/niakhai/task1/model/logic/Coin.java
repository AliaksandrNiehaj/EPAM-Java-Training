package by.epam.javatraining.niakhai.task1.model.logic;

import java.util.Random;

public class Coin {
	
	public static int calcHeads(int times) {
		
		Random random = new Random();
		int head = 0;
		boolean cast = false;
				
		if (times <= 0) {
			head = 0;
			return head;
		}
				
		for (int i = 0; i < times; i++) {
			cast = random.nextBoolean();
			if (cast) {
				head += 1;
			}
		}				
		return head;
	}
	
	public static int calcTails(int times, int head) {
		int tail = 0;
		
		if (times <= 0) {
			tail = 0;
			return tail;
		}
		
		tail = times - head;
		
		return tail;
	}
}