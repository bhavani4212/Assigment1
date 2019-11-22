package com.assignment1;

public class Gcd1 {

		   // extended Euclidean Algorithm
		   public  static int gcd1(int divider, int remainder)
		   {
		       if (divider == 0)
		           return remainder;
		       
		       return gcd1(remainder % divider, divider);
		   }

		

	/**public static Object gcd1(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object gcd1(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}**/

}

