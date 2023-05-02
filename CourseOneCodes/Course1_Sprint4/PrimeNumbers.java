package Course1_Sprint4;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choise;
		
    do 
	{
		System.out.print("Enter tne number : " );
		int num = input.nextInt();
		int temp=0;
		for(int i=2; i<=num-1; i++) {
			
			if(num%i==0) {
				temp = temp+1;
			}
		}
		if(temp==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime");
		}
		System.out.println("Enter 1 for continue and 0 for exit : ");
		choise = input.nextInt();
	}
	while(choise == 1);
		
			System.out.println("--------Thank You---------");
		
		
		
	}

}
