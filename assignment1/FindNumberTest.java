package com.assignment1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FindNumberTest {

	@Test
	public void findNumber() {
		Assert.assertEquals(true, FindNumber.numberIsInArray(40));
	}

	@Test
	public void notFindNumber() {
		Assert.assertEquals(false, FindNumber.numberIsInArray(32));
	}

}



