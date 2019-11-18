package com.onmiwyse.AssignmentONE1;

/* Java program to search an element  
in a sorted and pivoted array*/

//Time Complexity is O(logn)

public class SearchArray
{  
	public static void main(String args[])
	{
		int i, element = 6;
		int array[] = {7,3,9,13,2,5};
		for(i=0; i<array.length; i++)
		{
		   if (array[i] == element)	
		   {
			   System.out.println(element +" is present at location "+(i+1));
			   break;
		   }
		}
		if (i==array.length) {
			System.out.println(element + " doesn't exist in array.");
		}
	}
}


