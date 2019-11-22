package com.assignment1;

public class Primenumber {
	static boolean isPrime(int number)
	   {
	       // Corner case
	       if (number <= 1)
	           return false;
	 
	       // Check from 2 to number-1
	       for (int i = 2; i < number; i++)
	           if (number % i == 0)
	               return false;
	 
	       return true;
	   }
	 
	   // Driver Program
	   public static void main(String args[])
	   {
	       if (isPrime(11))
	           System.out.println(" true");
	       else
	           System.out.println(" false");
	       if (isPrime(15))
	           System.out.println(" true");
	       else
	           System.out.println(" false");
	   }
	}  

