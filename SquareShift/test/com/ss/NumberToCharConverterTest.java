package com.ss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberToCharConverterTest {

	
	
	@Test
	void test2() {
		NumberToCharConverter converter = new NumberToCharConverter(2);
		assertEquals('A', converter.getCurrentChar());
		assertFalse(converter.isLastItem());
		assertEquals('B', converter.getNextChar());
		assertFalse(converter.isLastItem());
		assertEquals('C', converter.getNextChar());
		assertTrue(converter.isLastItem());	
		assertEquals('A', converter.getNextChar());
		assertFalse(converter.isLastItem());	
	}
	
	@Test
	void test7() {
		NumberToCharConverter converter = new NumberToCharConverter(7);
		assertEquals('P', converter.getCurrentChar());
		assertFalse(converter.isLastItem());
		assertEquals('Q', converter.getNextChar());
		assertFalse(converter.isLastItem());
		assertEquals('R', converter.getNextChar());
		assertFalse(converter.isLastItem());
		assertEquals('S', converter.getNextChar());
		assertEquals('S', converter.getCurrentChar());
		assertTrue(converter.isLastItem());	
		assertEquals('P', converter.getNextChar());
		assertFalse(converter.isLastItem());
	}
	
	@Test
	void test1() {
		NumberToCharConverter converter = new NumberToCharConverter(1);
		assertEquals(Character.MIN_VALUE, converter.getCurrentChar());
		assertEquals(Character.MIN_VALUE, converter.getNextChar());
	}
	
	@Test
	void test0() {
		NumberToCharConverter converter = new NumberToCharConverter(0);
		assertEquals(Character.MIN_VALUE, converter.getCurrentChar());
		assertEquals(Character.MIN_VALUE, converter.getNextChar());
	}
	
	@Test
	void test3() {
		NumberToCharConverter converter = new NumberToCharConverter(3);
		assertEquals('D', converter.getCurrentChar());
		assertFalse(converter.isLastItem());
		assertEquals('E', converter.getNextChar());
		assertFalse(converter.isLastItem());
		assertEquals('F', converter.getNextChar());
		assertTrue(converter.isLastItem());	
	}

}

