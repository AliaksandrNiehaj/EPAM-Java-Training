package by.epam.javatraining.niakhai.task5.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaturalNumberTest {

	@Test
	public void testIsNatural() {
		
		int number = 34;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = false;
		assertEquals(expected, actual);
		
		number = 11;
		actual = NaturalNumber.isNatural(number);
		expected = true;
		assertEquals(expected, actual);
		
		number = 43;
		actual = NaturalNumber.isNatural(number);
		expected = true;
		assertEquals(expected, actual);
		
		number = 63;
		actual = NaturalNumber.isNatural(number);
		expected = false;
		assertEquals(expected, actual);
		
		number = 111;
		actual = NaturalNumber.isNatural(number);
		expected = false;
		assertEquals(expected, actual);
	}
}