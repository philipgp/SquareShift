package com.ss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneNumberSkipTest {

	@Test
	void test() {
		PhoneNumberSkip skipper = new PhoneNumberSkip();
		assertTrue(skipper.canSkip(0));
		skipper.skip(0);
		assertFalse(skipper.canSkip(1));
		assertTrue(skipper.canSkip(2));
	}

}
