package by.epam.javatraining.niakhai.task2.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceTest {

	@Test
	public void testGetSequenceInfo() {
		
		int number = 12345;
		String actual = Sequence.getSequenceInfo(number);
		String expected = "Is increase sequence.";
		
		assertEquals(expected, actual);
		
		number = 54321;
		actual = Sequence.getSequenceInfo(number);
		expected = "Is decrease sequence.";
		
		assertEquals(expected, actual);
		
		number = 54246;
		actual = Sequence.getSequenceInfo(number);
		expected = "Is not sequence.";
		
		assertEquals(expected, actual);
		
		number = 88888;
		actual = Sequence.getSequenceInfo(number);
		expected = "Is not sequence.";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsIncreaseSequence() {
		
		int number = 12345;
		boolean actual = Sequence.isIncreaseSequence(number);
		boolean expected = true;
		
		assertEquals(expected, actual);
		
		number = 269;
		actual = Sequence.isIncreaseSequence(number);
		expected = true;
		
		assertEquals(expected, actual);
		
		number = 1345789;
		actual = Sequence.isIncreaseSequence(number);
		expected = true;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIsDecreaseSequence() {
		
		int number = 987;
		boolean actual = Sequence.isDecreaseSequence(number);
		boolean expected = true;
		
		assertEquals(expected, actual);
		
		number = 96432;
		actual = Sequence.isDecreaseSequence(number);
		expected = true;
		
		assertEquals(expected, actual);
		
		number = 54;
		actual = Sequence.isDecreaseSequence(number);
		expected = true;
		
		assertEquals(expected, actual);
	}
}