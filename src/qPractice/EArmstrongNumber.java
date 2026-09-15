package qPractice;

import java.util.Scanner;

/*
An Armstrong number is a number where the sum of each digit raised to the power of the number of digits equals the original number.

For example:

153

1³ + 5³ + 3³
= 1 + 125 + 27
= 153

So 153 is an Armstrong number.

*/

public class EArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();  // 153
		
		int temp = num;    // 153
		int digits = 0;
		int original = num;   // 153
		
		// count the number of digits
		while(temp>0) {
			digits++;     // 1, 2, 3
			temp/=10;    // 15, 1, 0
		}
		
		temp=num;    // 153
		int sum = 0;

        // Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;    

            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;     
            }

            sum = sum + power;   
            temp = temp / 10;    
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

	}

}
