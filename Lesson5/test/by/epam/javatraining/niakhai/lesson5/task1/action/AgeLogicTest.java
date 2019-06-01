package by.epam.javatraining.niakhai.lesson5.task1.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeLogicTest {

	@Test
	public void testGetDragonHeads() {
		
		int age = 3;
		
		int expected = 12;
		
		if (AgeLogic.getDragonHeads(age) != expected) {
			fail();
		}
	}
	
	@Test
	public void testGetDragonEyes() {
		
		int heads = 10;
		
		int expected = 20;
		
		if (AgeLogic.getDragonEyes(heads) != expected) {
			fail();
		}
	}
	
	
}
