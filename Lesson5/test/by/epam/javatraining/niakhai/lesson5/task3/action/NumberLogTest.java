package by.epam.javatraining.niakhai.lesson5.task3.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberLogTest {

	@Test
	public void testGetMood() {
		int a = 4;
		String expected = ":(";
		
		if (!NumberLog.getMood(a).equals(expected)) {
			fail();
		}
	}
}