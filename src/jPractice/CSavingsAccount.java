package jPractice;

public class CSavingsAccount extends BankAccount{
	
	double interestRate;
	
	CSavingsAccount(int accountNumber, String holderName,
            double balance, double interestRate) {

 super(accountNumber, holderName, balance);

 this.interestRate = interestRate;
}
	
	void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
    }

}
