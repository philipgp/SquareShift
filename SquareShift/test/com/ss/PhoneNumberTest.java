package com.ss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneNumberTest {

	@Test
	void test() {
		Dictionary dictionary = new Dictionary();
		dictionary.add("CALL");
		dictionary.add("ME"); 
		PhoneNumber phoneNumber = new PhoneNumber("2255", dictionary);
		assertEquals("CALL",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("225563", dictionary);
		assertEquals("CALL-ME",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("2255632255", dictionary);
		assertEquals("CALL-ME-CALL",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("632255", dictionary);
		assertEquals("ME-CALL",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("225522255", dictionary);
		assertEquals("CALL-2-CALL",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("2255222558", dictionary);
		assertEquals("",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("2255222255", dictionary);
		assertEquals("",phoneNumber.generateString());
		
	}
	
	@Test
	void test3() {
		Dictionary dictionary = new Dictionary();
		dictionary.add("CALL");
		dictionary.add("ME");
		PhoneNumber phoneNumber = new PhoneNumber("88", dictionary);
		assertEquals("",phoneNumber.generateString());
		
		phoneNumber = new PhoneNumber("2255863", dictionary);
		assertEquals("CALL-8-ME",phoneNumber.generateString());
		
//		phoneNumber = new PhoneNumber("22558638", dictionary); // Unhandled
//		assertEquals("CALL-8-ME-8",phoneNumber.generateString());
		
		
	}
	
	
	@Test
	void test2() {
		Dictionary dictionary = new Dictionary();
		dictionary.add("CAGL"); 
		PhoneNumber phoneNumber = new PhoneNumber("2255", dictionary);
		assertEquals("",phoneNumber.generateString());
		phoneNumber = new PhoneNumber("2245", dictionary);
		assertEquals("CAGL",phoneNumber.generateString());
	}

}
