package by.epam.javatraining.niakhai.task4.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCheckerTest {

	@Test
	public void testFirIsEven() {
		
		int number = 0;
		boolean actual = NumberChecker.isEven(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecIsEven() {
		
		int number = 13579;
		boolean actual = NumberChecker.isEven(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdIsEven() {
		
		int number = 2224468;
		boolean actual = NumberChecker.isEven(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourIsEven() {
		
		int number = 297;
		boolean actual = NumberChecker.isEven(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testFirIsOdd() {
		
		int number = 0;
		boolean actual = NumberChecker.isOdd(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testSecIsOdd() {
		
		int number = 2468;
		boolean actual = NumberChecker.isOdd(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testThirdIsOdd() {
		
		int number = 73979;
		boolean actual = NumberChecker.isOdd(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourIsOdd() {
		
		int number = 729;
		boolean actual = NumberChecker.isOdd(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}