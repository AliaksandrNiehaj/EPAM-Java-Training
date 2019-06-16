package by.epam.javatraining.niakhai.task3.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFirGetFactorial() {
		
		int number = 0;
		long actual = Factorial.getFactorial(number);
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecGetFactorial() {
		int number = 1;
		long actual = Factorial.getFactorial(number);
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdGetFactorial() {
		
		int number = -10;
		long actual = Factorial.getFactorial(number);
		long expected = 3_628_800;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourGetFactorial() {
		
		int number = 5;
		long actual = Factorial.getFactorial(number);
		long expected = 120;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveGetFactorial() {
		
		int number = 12;
		long actual = Factorial.getFactorial(number);
		long expected = 479_001_600;
		assertEquals(expected, actual);
	}
}