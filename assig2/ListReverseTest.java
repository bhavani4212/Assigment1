package Assigment2.assig2;

 import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class ListReverseTest {

		@Test
		public void testListReverse() 
		{
			ArrayList<String> listInput = new ArrayList<String>();
			listInput.add("Intern");
			listInput.add("Technologies");
		    listInput.add("Omniwyse");
			
			ArrayList<String> listReverse = new ArrayList<String>();
			listReverse.add("Omniwyse");
			listReverse.add("Technologies");
			listReverse.add("Intern");
			Assert.assertEquals(listReverse, ListReverse.reverseList(listInput));
		}
	}



