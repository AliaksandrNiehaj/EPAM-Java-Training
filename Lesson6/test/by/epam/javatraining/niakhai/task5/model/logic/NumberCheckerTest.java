package by.epam.javatraining.niakhai.task5.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCheckerTest {

	@Test
	public void testCheckNumber() {
		
		int number = 4;
		boolean actual = NumberChecker.checkNumber(number);
		boolean expected = true;
		assertEquals(expected, actual);
		
		number = 0;
		actual = NumberChecker.checkNumber(number);
		expected = false;
		assertEquals(expected, actual);
		
		number = -12;
		actual = NumberChecker.checkNumber(number);
		expected = false;
		assertEquals(expected, actual);
	}
}