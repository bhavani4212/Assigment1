package com.assignment1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FibinociItaraterTest {


	@Test
	public void fibonacciSeries() {
		Assert.assertEquals(20, FibinociItarater.testFibonacciSeriesIterative(20));
	}

	@Test
	public void notFibonacciSeries() {
		Assert.assertNotEquals(6, FibinociItarater.testFibonacciSeriesIterative(5));

}
}

