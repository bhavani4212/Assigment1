package bank;

public class Test extends BankImplementation {
	public static void main(String [] args)
	{
		BankMethods b1= new Test();
		b1.showBalance();
		b1.withDraw();
		b1.remainingBalance();
	}
}
