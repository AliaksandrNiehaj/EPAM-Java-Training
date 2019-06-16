package by.epam.javatraining.niakhai.task1.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoin {

	@Test
	public void testFirCalcHeads() {
		int times = -1;
		int actual = Coin.calcHeads(times);
		int expected = 0;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSecCalcHeads() {
		int times = 0;
		int actual = Coin.calcHeads(times);
		int expected = 0;
		
		assertEquals(expected, actual);
		
	}

	@Test
	public void testFirCalcTails() {
		int times = 0;
		int head = 0;
		int actual = Coin.calcTails(times, head);
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSecCalcTails() {
		int times = -1;
		int head = 0;
		int actual = Coin.calcTails(times, head);
		int expected = 0;
		
		assertEquals(expected, actual);
	}

}
