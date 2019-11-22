package com.assignment1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimenumberTest {

	@Test
	void test() {
		Assertions.assertEquals(true,Primenumber.isPrime(7));
	}

}
