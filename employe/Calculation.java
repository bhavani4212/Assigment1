package employe;

import java.util.Scanner;

public class Calculation {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		Tax tci= new Tax();
		
		System.out.println("Enter CTC of employee:");
		sc = new Scanner(System.in);
		float ctc=sc.nextInt();
		 tci.esiCalculation(ctc);
		 tci.pfCalculation(ctc);
		 tci.ptCalculation(ctc);
		 tci.incometaxCalculation(ctc);
		 tci.rebate(ctc);
		 tci.empNetSalary(ctc);
	}

}