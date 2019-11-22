package com.assignment1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Program8Test {

	@Test
	void test() {
		Assert.assertEquals(8, Program8.power(2,3 ));
		Assert.assertEquals(256, Program8.power(4,4 ));
	}

}
