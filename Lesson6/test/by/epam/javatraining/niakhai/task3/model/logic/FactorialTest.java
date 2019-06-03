package by.epam.javatraining.niakhai.task3.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testGetFactorial() {
		
		int number = 5;
		long actual = Factorial.getFactorial(number);
		long expected = 120;
		assertEquals(expected, actual);
		
		number = 12;
		actual = Factorial.getFactorial(number);
		expected = 479_001_600;
		assertEquals(expected, actual);
		
		number = 10;
		actual = Factorial.getFactorial(number);
		expected = 3_628_800;
		assertEquals(expected, actual);
		
		number = 0;
		actual = Factorial.getFactorial(number);
		expected = 1;
		assertEquals(expected, actual);
		
		number = 1;
		actual = Factorial.getFactorial(number);
		expected = 1;
		assertEquals(expected, actual);
	}
}