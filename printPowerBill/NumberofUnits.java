package printPowerBill;

import java.util.Scanner;

public  class NumberofUnits 
{
	public static Scanner s;
	
	public static double bill;

	public static void main(String [] args)
	{
		   System.out.println("enter the no.of units");
		s = new Scanner(System.in);
        double unit=s.nextDouble();
        if((unit<100))
        {
        	bill= (double)unit*2.50;
        }
        if((unit>=100) & (unit<500) )
        {
        	bill=(unit-100)*3;
        	//System.out.println((100*2.5)+bill);
        }
   if(unit>500)
   {
	   bill=(unit-500)*4.5;
	  // System.out.println((100*2.5)+(400*3.0)+bill);
   }
       System.out.println(bill);
        }
	}

        

