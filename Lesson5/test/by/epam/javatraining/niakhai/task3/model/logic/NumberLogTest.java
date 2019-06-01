package by.epam.javatraining.niakhai.task3.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epam.javatraining.niakhai.task3.model.logic.NumberLog;

public class NumberLogTest {

	@Test
	public void testGetMood() {
		
		int a = 4;
		String expected = ":(";
		assertEquals(expected, NumberLog.getMood(a));
		
		a = 44;
		expected = ":|";
		assertEquals(expected, NumberLog.getMood(a));
		
		a = 83;
		expected = ":)";
		assertEquals(expected, NumberLog.getMood(a));
	}
}