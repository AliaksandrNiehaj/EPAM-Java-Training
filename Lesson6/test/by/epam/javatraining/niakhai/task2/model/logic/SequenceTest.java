package by.epam.javatraining.niakhai.task2.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceTest {

	@Test
	public void testFirIsIncreaseSequence() {
		int number = -1;
		boolean actual = Sequence.isIncreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void testSecIsIncreaseSequence() {
		int number = 0;
		boolean actual = Sequence.isIncreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdIsIncreaseSequence() {
		int number = 9;
		boolean actual = Sequence.isIncreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourIsIncreaseSequence() {
		int number = 12;
		boolean actual = Sequence.isIncreaseSequence(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveIsIncreaseSequence() {
		int number = 21;
		boolean actual = Sequence.isIncreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testFirIsDecreaseSequence() {
		int number = -1;
		boolean actual = Sequence.isDecreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	@Test
	public void testSecIsDecreaseSequence() {
		int number = 0;
		boolean actual = Sequence.isDecreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testThirdDecreaseSequence() {
		int number = 9;
		boolean actual = Sequence.isDecreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFourIsDecreaseSequence() {
		int number = 12;
		boolean actual = Sequence.isDecreaseSequence(number);
		boolean expected = false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFiveIsDecreaseSequence() {
		int number = 21;
		boolean actual = Sequence.isDecreaseSequence(number);
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
