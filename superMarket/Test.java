package superMarket;

	import java.util.Scanner;

	public class Test extends Products {

		private static char c;
		private static Scanner s;

		public static void main(String[] args) {
			
			/**
			 * sm is the reference of the SuperMarket Interface by creating object for the Test Class
			 */
			
	          Market sm= (Market) new Test();
			sm.display();
			System.out.println("\nSelect 1 for Rice\nSelect 2 for Dal\nSelect 3 for Flour");
			/**
			 * do while loop is used to ask the user continiously for the input.
			 * if user press 'n' then it stops the iteration.
			 */
			
			do {
			
				s = new Scanner(System.in);
				int n=s.nextInt();
				switch(n) {
				case 1:rice1 = sm.selectRice();
						rice1=rice1*Market.RICE;
						break;
				case 2:dal1 = sm.selectDal();
						dal1=dal1*Market.DAL;
					break;
				case 3:flour1=sm.selectFlour();
						flour1=flour1*Market.FLOUR;
					break;
				default : System.out.println("INVALID ENTRY");
				}
				
				System.out.println("Do You Want to Continue:y/n");
				 c=s.next().charAt(0);
			}while(c!='n');
			// calling the bill function to calculate bill.
			sm.bill(rice1,dal1,flour1);
			
		}
			
	}



