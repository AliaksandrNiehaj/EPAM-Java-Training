package by.epam.javatraining.niakhai.task1.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import by.epam.javatraining.niakhai.task1.model.logic.AgeLogic;

public class AgeLogicTest {

	@Test
	public void testGetDragonHeads() {
		
		int age = 3;
		int expected = 12;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
		
		age = 20;
		expected = 63;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
		
		age = 115;
		expected = 348;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
		
		age = 200;
		expected = 603;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
		
		age = 257;
		expected = 717;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
		
		age = 300;
		expected = 803;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
		
		age = 315;
		expected = 818;
		assertEquals(expected, AgeLogic.getDragonHeads(age));
	}
	
	@Test
	public void testGetDragonEyes() {
		
		int head = 10;
		int expected = 20;
		assertEquals(expected, AgeLogic.getDragonEyes(head));
		
		head = 119;
		expected = 238;
		assertEquals(expected, AgeLogic.getDragonEyes(head));
		
		head = 428;
		expected = 856;
		assertEquals(expected, AgeLogic.getDragonEyes(head));
	}
}