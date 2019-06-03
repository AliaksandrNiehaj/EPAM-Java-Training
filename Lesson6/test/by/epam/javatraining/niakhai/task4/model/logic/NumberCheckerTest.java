package by.epam.javatraining.niakhai.task4.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCheckerTest {

	@Test
	public void testGetInfo() {
		int number = 143454345;
		String actual = NumberChecker.getInfo(number);
		String expected = "All numbers are different.";
		assertEquals(expected, actual);
		
		number = 2224468;
		actual = NumberChecker.getInfo(number);
		expected = "All numbers are even.";
		assertEquals(expected, actual);
		
		number = 13579;
		actual = NumberChecker.getInfo(number);
		expected = "All numbers are odd.";
		assertEquals(expected, actual);
	}

	@Test
	public void testIsEven() {
		
		int number = 2224468;
		boolean actual = NumberChecker.isEven(number);
		boolean expected = true;
		assertEquals(expected, actual);
		
		number = 13579;
		actual = NumberChecker.isEven(number);
		expected = false;
		assertEquals(expected, actual);
		
	}

	@Test
	public void testIsOdd() {
		
		int number = 2468;
		boolean actual = NumberChecker.isOdd(number);
		boolean expected = false;
		assertEquals(expected, actual);
		
		number = 73979;
		actual = NumberChecker.isOdd(number);
		expected = true;
		assertEquals(expected, actual);
	}
}