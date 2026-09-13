package jPractice;

public class DMainClass {

	public static void main(String[] args) {
		
		CSavingsAccount account = new CSavingsAccount(101, "Sayli", 10000, 5);
		account.displayBalance();

        account.deposit(2000);

        account.displayBalance();

        account.calculateInterest();

	}

}
