package by.epam.javatraining.niakhai.task2.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;
import by.epam.javatraining.niakhai.task2.model.logic.SymbolLogic;

public class SymbolLogicTest {

	@Test
	public void testGetSymbolInfo() {
		String str = "a";
		String expected = "Is vowel a (Latin).";
		assertEquals(expected, SymbolLogic.getSymbolInfo(str));
		
		str = "f";
		expected = "This symbol isn't vowel.";
		assertEquals(expected, SymbolLogic.getSymbolInfo(str));
		
		str = "1";
		expected = "This symbol isn't vowel.";
		assertEquals(expected, SymbolLogic.getSymbolInfo(str));
	}

	@Test
	public void testCheckSymbol() {
		
		String str = "a";
		boolean actual = SymbolLogic.checkSymbol(str);
		boolean expected = true;
		assertEquals(expected, actual);
		
		str = "0";
		actual = SymbolLogic.checkSymbol(str);
		expected = true;
		assertEquals(expected, actual);
		
		str = "0sdh";
		actual = SymbolLogic.checkSymbol(str);
		expected = false;
		assertEquals(expected, actual);
	}
}