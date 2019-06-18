package by.epam.javatraining.niakhai.maintask01.logic.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorLogicTest {

	@Test
	public void testFirIsSequence() {
		
		int[] array = new int[0];
		boolean actual = VectorLogic.isSequence(array);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecIsSequence() {
		
		int[] array = new int[] {4};
		boolean actual = VectorLogic.isSequence(array);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdIsSequence() {
		
		int[] array = new int[] {1, 12, 23};
		boolean actual = VectorLogic.isSequence(array);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourIsSequence() {
		
		int[] array = new int[] {1, 112, 23};
		boolean actual = VectorLogic.isSequence(array);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveIsSequence() {
		
		int[] array = new int[] {110, 98, 23};
		boolean actual = VectorLogic.isSequence(array);
		boolean expected = true;
		assertEquals(expected, actual);
	}
}