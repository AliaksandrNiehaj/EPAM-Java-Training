package by.epam.javatraining.niakhai.maintask01.logic.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorLogicTest {

	@Test
	public void testMaxValue() {
		
		int[] array = new int[] {1, 8, 13};
		int actual = VectorLogic.maxValue(array);
		int expected = 13;
		assertEquals(expected, actual);
	}

	@Test
	public void testMinValue() {
		
		int[] array = new int[] {1, 8, 13};
		int actual = VectorLogic.minValue(array);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testMiddleArithmetic() {
		
		int[] array = new int[] {1, 8, 12};
		double actual = VectorLogic.middleArithmetic(array);
		double expected = 7.0;
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testMiddleGeometric() {
		
		int[] array = new int[] {1, 8, 12};
		double actual = VectorLogic.middleGeometric(array);
		double expected = 4.578;
		assertEquals(expected, actual, 0.001);
	}

	@Test
	public void testIsSequence() {
		
		int[] array = new int[] {1, 12, 23};
		boolean actual = VectorLogic.isSequence(array);
		boolean expected = true;
		assertEquals(expected, actual);
		
		array = new int[] {1, 112, 23};
		actual = VectorLogic.isSequence(array);
		expected = false;
		assertEquals(expected, actual);
		
		array = new int[] {110, 98, 23};
		actual = VectorLogic.isSequence(array);
		expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testFirstLocalMin() {
		
		int[] array = new int[] {16, 12, 23, 14};
		int actual = VectorLogic.firstLocalMin(array);
		int expected = 1;
		assertEquals(expected, actual);
		
		array = new int[] {1, 112, 23};
		actual = VectorLogic.firstLocalMin(array);
		expected = 0;
		assertEquals(expected, actual);
		
		array = new int[] {100, 112, 23};
		actual = VectorLogic.firstLocalMin(array);
		expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testFirstLocalMax() {
		
		int[] array = new int[] {16, 12, 23, 14};
		int actual = VectorLogic.firstLocalMax(array);
		int expected = 2;
		assertEquals(expected, actual);
		
		array = new int[] {1, 112, 23};
		actual = VectorLogic.firstLocalMax(array);
		expected = 1;
		assertEquals(expected, actual);
		
		array = new int[] {120, 11, 23};
		actual = VectorLogic.firstLocalMax(array);
		expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testReverseArray() {
		
		int[] array = new int[] {1, 2, 3};
		int[] actual = VectorLogic.reverseArray(array);
		int[] expected = new int[]{3, 2, 1};
		assertArrayEquals(expected, actual);
		
		array = new int[] {1, 12, 3, 44};
		actual = VectorLogic.reverseArray(array);
		expected = new int[]{44, 3, 12, 1};
		assertArrayEquals(expected, actual);
		
		array = new int[] {1, 12, 3, 44, 4};
		actual = VectorLogic.reverseArray(array);
		expected = new int[]{4, 44, 3, 12, 1};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testLinearSearch() {
		
		int[] array = new int[] {1, 2, 3};
		int search = 3;
		int actual = VectorLogic.linearSearch(search, array);
		int expected = 2;
		assertEquals(expected, actual);
		
		array = new int[] {1, 2, 3, 65, 75, 11};
		search = 11;
		actual = VectorLogic.linearSearch(search, array);
		expected = 5;
		assertEquals(expected, actual);
		
		array = new int[] {13, 20, 23};
		search = 20;
		actual = VectorLogic.linearSearch(search, array);
		expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBubbleSorting() {
		
		int[] array = new int[] {10, 2, 1};
		int[] actual = VectorLogic.bubbleSorting(array);
		int[] expected = new int[]{1, 2, 10};
		assertArrayEquals(expected, actual);
		
		array = new int[] {1, 12, 3, 44};
		actual = VectorLogic.bubbleSorting(array);
		expected = new int[]{1, 3, 12, 44};
		assertArrayEquals(expected, actual);
		
		array = new int[] {4, 2, 2, 1, 4};
		actual = VectorLogic.bubbleSorting(array);
		expected = new int[]{1, 2, 2, 4, 4};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testInsertionSorting() {
		
		int[] array = new int[] {10, 2, 1};
		int[] actual = VectorLogic.insertionSort(array);
		int[] expected = new int[]{1, 2, 10};
		assertArrayEquals(expected, actual);
		
		array = new int[] {1, 12, 3, 44};
		actual = VectorLogic.insertionSort(array);
		expected = new int[]{1, 3, 12, 44};
		assertArrayEquals(expected, actual);
		
		array = new int[] {4, 2, 2, 1, 4};
		actual = VectorLogic.insertionSort(array);
		expected = new int[]{1, 2, 2, 4, 4};
		assertArrayEquals(expected, actual);
	}
}