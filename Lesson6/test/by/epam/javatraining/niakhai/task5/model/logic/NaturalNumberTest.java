package by.epam.javatraining.niakhai.task5.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaturalNumberTest {

	@Test
	public void testFirIsNatural() {
		
		int number = 0;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecIsNatural() {
		
		int number = -5;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdIsNatural() {
		
		int number = 1;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourIsNatural() {
		
		int number = 11;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveIsNatural() {
		
		int number = 12;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSixIsNatural() {
		
		int number = 29;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSevenIsNatural() {
		
		int number = 30;
		boolean actual = NaturalNumber.isNatural(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}