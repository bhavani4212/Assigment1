package com.assignment1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TowerTest {

	public class TestTower {
	@Test
	public void test() {
		Assert.assertEquals(1, Tower.towerOfHanoiPuzzle(3, 'A', 'c', 'B'));
	}
	}
}


