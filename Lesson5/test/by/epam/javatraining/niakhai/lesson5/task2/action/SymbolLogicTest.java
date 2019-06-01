package by.epam.javatraining.niakhai.lesson5.task2.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class SymbolLogicTest {

	@Test
	public void testGetSymbolInfo() {
		String str = "a";
		
		String expected = "Is vowel a (Latin).";
		
		if (!SymbolLogic.getSymbolInfo(str).equals(expected)) {
			fail();
		}
	}

	@Test
	public void testCheckSymbol() {
		
		String s = "a";
		
		boolean expected = true;
		
		if (SymbolLogic.checkSymbol(s) != expected) {
			fail();
		}
		
	}

}
