package by.epam.javatraining.niakhai.task3.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCheckerTest {

	@Test
	public void testCheckNumber() {
		
		int number = 0;
		boolean actual = NumberChecker.checkNumber(number);
		boolean expected = true;
		
		assertEquals(expected, actual);
		
		number = 1;
		actual = NumberChecker.checkNumber(number);
		expected = true;
		
		assertEquals(expected, actual);
		
		number = 14;
		actual = NumberChecker.checkNumber(number);
		expected = true;
		
		assertEquals(expected, actual);
		
		number = -1;
		actual = NumberChecker.checkNumber(number);
		expected = false;
		
		assertEquals(expected, actual);
	}
}