package eScannerClass;

import java.math.BigDecimal;

//check balance
//deposit
//withdraw
//password/pin check
//pin change
//exit

import java.util.Scanner;

public class BATM {
	
	public static double current_amount=0.0;
	private int pin=1234;
	
	Scanner sc = new Scanner(System.in);
	
	public boolean checkPin() {
		
		int attempts = 0;
		int maxAttempts = 3;
		
		while(attempts<maxAttempts) {
			System.out.println("Enter your PIN : ");
			int enteredPin = sc.nextInt();
			
			if(enteredPin == pin) {
				System.out.println("PIN verified successfully!");
				return true;
			} else {
				attempts++;
				System.out.println("Incorrect PIN!");
				if(attempts<maxAttempts) {
					System.out.println("Attempts remaining : "+(maxAttempts-attempts));
				}
			}
		}
		
		System.out.println("You have entered an incorrect PIN 3 times.");
        System.out.println("Your account has been locked!");
		
		return false;
	}
	
	public void displayMenu() {
		System.out.println("================ ATM Menu =================");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Amount");
		System.out.println("3. Withdraw Amount");
		System.out.println("4. Change PIN");
		System.out.println("5. Exit");
		
	}
	
	public void checkBalance() {
		System.out.println("Your current balance is : Rs. "+current_amount );
	}
	
	public void deposit() {
		System.out.println("Enter the amount you want to deposit : Rs. ");
		double dep_amt = sc.nextDouble();
		current_amount += dep_amt;
		System.out.println("Amount deposited successfully.");
		System.out.println("Your current balance after adding the deposit is : Rs. "+current_amount);
	}
	
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw : Rs. ");
		double with_amt = sc.nextDouble();
		if(with_amt>current_amount) {
			System.out.println("Sorry! the withdrawal amount is bigger than your current bank balance, therefore you "
					+ "cannot withdraw this amount");
		}else {
			current_amount-=with_amt;
			System.out.println("Amount withdrawn successfully.");
			System.out.println("Your current bank balance after withdrawaing the amount is : Rs. "+current_amount);
		}
	}
	
	public void changePin() {
		System.out.println("Enter current PIN : ");
		int oldPin = sc.nextInt();
		
		if(oldPin != pin) {
			System.out.println("Incorrect PIN. Cannot change PIN.");
			return;
		}
			System.out.println("Enter new 4-digit PIN : ");
			int newPin = sc.nextInt();
			
			if(newPin < 1000 || newPin>9999) {
				System.out.println("PIN must contain only and exactly 4 digits.");
				return;
			}
			
			System.out.println("Confirm new PIN : ");
			int confirmPin = sc.nextInt();
			
			if(newPin != confirmPin) {
				System.out.println("PINs do not match. Cannot change the PIN.");
				return;
			}
			
			pin = newPin;
			System.out.println("PIN changed successfully!");
		
	}
	
	public void bankFunctions() {
		
		boolean authenticated = checkPin();
		
		if (!authenticated) {

            System.out.println(
                "Access denied. Exiting ATM..."
            );

            System.out.println(
                "Thank you for using the ATM !!!"
            );

            return;
        }
		
		
		boolean running = true;
		
		while(running) {
			
//			if(!checkPin()) {
//				continue;
//			}
			
			displayMenu();
			System.out.println("Enter the number of functionality you want to perform : ");
			
			int option = sc.nextInt();
			
			switch(option) {
			
			case 1: checkBalance();
			break;
			
			case 2: deposit();
			break;
			
			case 3: withdraw();
			break;
			
			case 4: changePin();
			break;
			
			case 5: System.out.println("Exiting...");
			running = false;
			break;
			
			default: System.out.println("Wrong option.");
			}
		}
		
		System.out.println("Thank you for using the ATM !!!");
	
	}

	public static void main(String[] args) {
		
		BATM a1= new BATM();
		a1.bankFunctions();

	}

}
