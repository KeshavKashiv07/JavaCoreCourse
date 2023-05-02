package Course1_Sprint4;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choise;
	do {	
		System.out.println("enter the number ");
		int n1 = input.nextInt();
		
		int remainder;
		int sum=0;
		while(n1>0) {
			remainder = n1 % 10;   
		    n1 = n1/10;
		    sum= sum+remainder;
		}
		System.out.println("sum is : " + sum);
		System.out.println("Enter 1 for continue and 0 for exit : ");
		choise = input.nextInt();
	}
	while(choise == 1);
	
	System.out.println("--------Thank You---------");

	}


}
