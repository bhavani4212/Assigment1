package com.assignment1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalinTest {

	@Test
	void test() {
		new Palin();
		Assertions.assertEquals(true, Palin.isPalRec("bhb", 0, 2));
		
	}

}
