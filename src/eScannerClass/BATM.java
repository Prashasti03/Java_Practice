package eScannerClass;

import java.util.Scanner;

public class BATM {
	
	public static double current_amount=0;
//	public double withdrawal_amount;
//	public double deposit_amount;
	
	public void bankFunctions() {
		Scanner sc = new Scanner(System.in);
		
		char cont;
		
		do {
			
			System.out.println("================ ATM Menu =================");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("Enter the number of functionality you want to perform : ");
			
			int option = sc.nextInt();
			
			switch(option) {
			
			case 1: System.out.println("Your current balance is : Rs. "+current_amount );
			break;
			
			case 2: System.out.println("Enter the amount you want to deposit : Rs. ");
			double dep_amt = sc.nextDouble();
			current_amount += dep_amt;
			System.out.println("Your current balance after adding the deposit is : Rs. "+current_amount);
			break;
			
			case 3: System.out.println("Enter the amount you want to withdraw : Rs. ");
			double with_amt = sc.nextDouble();
			if(with_amt>current_amount) {
				System.out.println("Sorry! the withdrawal amount is bigger than your current bank balance, therefore you "
						+ "cannot withdraw this amount");
			}else {
				current_amount-=with_amt;
				System.out.println("Your current bank balance after withdrawaing the amount is : Rs. "+current_amount);
			}
			break;
			
			case 4: System.out.println("Exiting.....");
			
			break;
			
			default: System.out.println("Wrong input");
			}
			
			System.out.println("Do you want to continue? (y/n) : ");
			cont = sc.next().charAt(0);
			
			
			
		}while(cont=='y');
		System.out.println("Thank you for using the ATM !!!");
		
		
	}

	public static void main(String[] args) {
		
		BATM a1= new BATM();
		a1.bankFunctions();

	}

}
