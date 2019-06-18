package by.epam.javatraining.niakhai.maintask01.logic.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorSearchTest {

	@Test
	public void testFirMaxValue() {
		
		int[] array = new int[0];
		int actual = VectorSearch.maxValue(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecMaxValue() {
		
		int[] array = new int[] {5};
		int actual = VectorSearch.maxValue(array);
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdMaxValue() {
		
		int[] array = new int[] {14, 7, 9, 0, 1, -7, 2};
		int actual = VectorSearch.maxValue(array);
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFirMinValue() {
		
		int[] array = new int[0];
		int actual = VectorSearch.minValue(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecMinValue() {
		
		int[] array = new int[] {5};
		int actual = VectorSearch.minValue(array);
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdMinValue() {
		
		int[] array = new int[] {14, 7, 9, 0, 1, -7, 2};
		int actual = VectorSearch.minValue(array);
		int expected = -7;
		assertEquals(expected, actual);
	}

	@Test
	public void testOneFirstLocalMin() {
		
		int[] array = new int[0];
		int actual = VectorSearch.firstLocalMin(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTwoFirstLocalMin() {
		
		int[] array = new int[] {16};
		int actual = VectorSearch.firstLocalMin(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThreeFirstLocalMin() {
		
		int[] array = new int[] {12, 23};
		int actual = VectorSearch.firstLocalMin(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourFirstLocalMin() {
		
		int[] array = new int[] {23, 12};
		int actual = VectorSearch.firstLocalMin(array);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveFirstLocalMin() {
		
		int[] array = new int[] {16, 12, 23, 14};
		int actual = VectorSearch.firstLocalMin(array);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testOneFirstLocalMax() {
		
		int[] array = new int[0];
		int actual = VectorSearch.firstLocalMax(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTwoFirstLocalMax() {
		
		int[] array = new int[] {16};
		int actual = VectorSearch.firstLocalMax(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThreeFirstLocalMax() {
		
		int[] array = new int[] {12, 23};
		int actual = VectorSearch.firstLocalMax(array);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourFirstLocalMax() {
		
		int[] array = new int[] {23, 12};
		int actual = VectorSearch.firstLocalMax(array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveFirstLocalMax() {
		
		int[] array = new int[] {16, 12, 23, 14};
		int actual = VectorSearch.firstLocalMax(array);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testFirLinearSearch() {
		
		int[] array = new int[0];
		int search = 3;
		int actual = VectorSearch.linearSearch(search, array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecLinearSearch() {
		
		int[] array = new int[] {3};
		int search = 3;
		int actual = VectorSearch.linearSearch(search, array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdLinearSearch() {
		
		int[] array = new int[] {1, 2, 3};
		int search = 3;
		int actual = VectorSearch.linearSearch(search, array);
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourLinearSearch() {
		
		int[] array = new int[] {1, 2, 3, 65, 75, 11};
		int search = 11;
		int actual = VectorSearch.linearSearch(search, array);
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveLinearSearch() {
		
		int[] array = new int[] {65, 11};
		int search = 65;
		int actual = VectorSearch.linearSearch(search, array);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBynarySearch() {
		fail("Not yet implemented");
	}

}
