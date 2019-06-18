package by.epam.javatraining.niakhai.maintask01.logic.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorArithmeticTest {

	@Test
	public void testFirMiddleArithmetic() {
		
		int[] array = new int[] {1, 8, 12, 19, 6, 0, 7};
		double actual = VectorArithmetic.middleArithmetic(array);
		double expected = 7.57;
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testSecMiddleArithmetic() {
		
		int[] array = new int[] {8};
		double actual = VectorArithmetic.middleArithmetic(array);
		double expected = 8.0;
		assertEquals(expected, actual, 0.01);
	}
	
	@Test
	public void testThirdMiddleArithmetic() {
		
		int[] array = new int[0];
		double actual = VectorArithmetic.middleArithmetic(array);
		double expected = 0.0;
		assertEquals(expected, actual, 0.01);
	}

	@Test
	public void testFirMiddleGeometric() {
		
		int[] array = new int[0];
		double actual = VectorArithmetic.middleGeometric(array);
		double expected = 0.0;
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testSecMiddleGeometric() {
		
		int[] array = new int[] {12};
		double actual = VectorArithmetic.middleGeometric(array);
		double expected = 0.0;
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testThirdMiddleGeometric() {
		
		int[] array = new int[] {1, 8, 12};
		double actual = VectorArithmetic.middleGeometric(array);
		double expected = 4.579;
		assertEquals(expected, actual, 0.001);
	}
}