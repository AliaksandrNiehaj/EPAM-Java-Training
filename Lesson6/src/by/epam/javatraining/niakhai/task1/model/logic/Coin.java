package by.epam.javatraining.niakhai.task1.model.logic;

import java.util.Random;

public class Coin {
	
	public static int getHeads(int times) {
		
		int head = 0;		
		if (times > 0) {
			
			Random random = new Random();
			for (int i = 0; i < times; i++) {
				int temp = random.nextInt(2);
				
				if (temp == 1) {
					head += 1;
				}
			}
		}
		return head;
	}
	
	public static int getTails(int head) {
		return 1000 - head;
	}
}