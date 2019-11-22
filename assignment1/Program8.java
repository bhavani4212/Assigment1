package com.assignment1;

public class Program8 {
		static int power(int number, int powernumber)
		    {
		        if (powernumber == 0)
		            return 1;
		        else if (powernumber % 2 == 0)
		            return power(number, powernumber / 2) * power(number, powernumber / 2);
		        else
		            return number * power(number, powernumber / 2) * power(number, powernumber / 2);
		    }
		 
		    /* Program to test function power 
		    public static void main(String[] args)
		    {
		        int number = 2;
		        int powernumber = 3;
		        System.out.printf("%d", power(number, powernumber));
		    }**/
		}
	


