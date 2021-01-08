package com.ss;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PhoneNumberPermutterTest {

	@Test
	void test0() {
		List<NumberToCharConverter> result = PhoneNumberPermutter.initializeConverter("0");
		assertEquals(1,result.size()); 
		assertEquals(0,result.get(0).getNumber());
	}
	
	@Test
	void test2() {
		List<NumberToCharConverter> result = PhoneNumberPermutter.initializeConverter("01");
		assertEquals(2,result.size()); 
		assertEquals(0,result.get(0).getNumber());
		assertEquals(1,result.get(1).getNumber());
	}
	
	@Test
	void test3() {
		List<NumberToCharConverter> result = PhoneNumberPermutter.initializeConverter("123");
		assertEquals(3,result.size()); 
		assertEquals(1,result.get(0).getNumber());
		assertEquals(2,result.get(1).getNumber());
		assertEquals(3,result.get(2).getNumber());
	}
	
	/**
	 * 2
	 */
	//@Test
	void test4() {
		PhoneNumberPermutter permutter = new PhoneNumberPermutter("2");
		String result = permutter.getNext();
		assertEquals("A",result);
		result = permutter.getNext();
		assertEquals("B",result);
		result = permutter.getNext();
		assertEquals("C",result);
		result = permutter.getNext();
		assertEquals("",result);
	}
	
	/**
	 * 22
	 */
	@Test
	void test5() {
		PhoneNumberPermutter permutter = new PhoneNumberPermutter("23");
		String result = permutter.getNext();
		assertEquals("AD",result);
		result = permutter.getNext();
		assertEquals("AE",result);
		result = permutter.getNext();
		assertEquals("AF",result);
		result = permutter.getNext();
		
		assertEquals("BD",result);
		result = permutter.getNext();
		assertEquals("BE",result);
		result = permutter.getNext();
		assertEquals("BF",result);
		
		result = permutter.getNext();
		assertEquals("CD",result);
		result = permutter.getNext();
		assertEquals("CE",result);
		result = permutter.getNext();
		assertEquals("CF",result);
		
		
	}
	
	/**
	 * 222
	 */
	@Test
	void test6() {
		PhoneNumberPermutter permutter = new PhoneNumberPermutter("234");
		
		String result = permutter.getNext();
		assertEquals("ADG",result);
		result = permutter.getNext();
		assertEquals("ADH",result);
		result = permutter.getNext();
		assertEquals("ADI",result);
		
		result = permutter.getNext();
		assertEquals("AEG",result);
		result = permutter.getNext();
		assertEquals("AEH",result);
		result = permutter.getNext();
		assertEquals("AEI",result);
		
		result = permutter.getNext();
		assertEquals("AFG",result);
		result = permutter.getNext();
		assertEquals("AFH",result);
		result = permutter.getNext();
		assertEquals("AFI",result);
		
		
		result = permutter.getNext();
		assertEquals("BDG",result);
		result = permutter.getNext();
		assertEquals("BDH",result);
		result = permutter.getNext();
		assertEquals("BDI",result);
		
	}
	
	
	/**
	 * 2222
	 */
	@Test
	void test7() {
		PhoneNumberPermutter permutter = new PhoneNumberPermutter("2222");
		String result = permutter.getNext();
		
		assertEquals("AAAA",result);
		result = permutter.getNext();
		assertEquals("AAAB",result);
		result = permutter.getNext();
		assertEquals("AAAC",result);
		result = permutter.getNext();
		assertEquals("AABA",result);
		result = permutter.getNext();
		assertEquals("AABB",result);
		result = permutter.getNext();
		assertEquals("AABC",result);
		result = permutter.getNext();
		assertEquals("AACA",result);
		result = permutter.getNext();
		assertEquals("AACB",result);
		result = permutter.getNext();
		assertEquals("AACC",result);
		
		result = permutter.getNext();
		assertEquals("ABAA",result);
		result = permutter.getNext();
		assertEquals("ABAB",result);
		result = permutter.getNext();
		assertEquals("ABAC",result);
		
	}
	

}
