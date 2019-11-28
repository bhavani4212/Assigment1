package bank;

import java.util.Scanner;

public abstract class BankImplementation implements BankMethods {
	int withDraw,remainingBalance,showBalance;
	
	Scanner sc=new Scanner(System.in);
	
	public void showBalance()
	{
		System.out.println("total balance is:");
		showBalance=sc.nextInt();
	}
	public void withDraw()
	{
		System.out.println("withdraw:");
		withDraw=sc.nextInt();
	}
	public void remainingBalance()
	{
		showBalance=showBalance-withDraw;
		System.out.println("remaining balance :"+showBalance);
	}

}
