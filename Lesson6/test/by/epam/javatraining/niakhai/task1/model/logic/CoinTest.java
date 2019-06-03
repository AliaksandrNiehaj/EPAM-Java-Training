package by.epam.javatraining.niakhai.task1.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoinTest {

	@Test
	public void testGetTails() {
		
		int heads = 500;
		int actual = Coin.getTails(heads);
		int expected = 500;
		
		assertEquals(expected, actual);
		
		
		heads = 312;
		actual = Coin.getTails(heads);
		expected = 688;
		
		assertEquals(expected, actual);
		
		
		heads = 469;
		actual = Coin.getTails(heads);
		expected = 531;
		
		assertEquals(expected, actual);
	}
}