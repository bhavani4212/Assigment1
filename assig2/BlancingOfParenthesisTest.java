package Assigment2.assig2;

import org.junit.Assert;
import org.junit.Test;

public class BlancingOfParenthesisTest {

	@Test
	public void test() 
	{
		char balancedParenthesis[] = {'{','(',')','}'};
		Assert.assertEquals(true, BlancingOfParenthesis.isParenthesisBalanced(balancedParenthesis));
		char inBalancedParenthesis[] = {'{','}',')','}'};
		Assert.assertEquals(false, BlancingOfParenthesis.isParenthesisBalanced(inBalancedParenthesis));
		
	}

}
