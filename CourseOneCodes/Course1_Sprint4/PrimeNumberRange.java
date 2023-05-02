package Course1_Sprint4;

import java.util.Scanner;

public class PrimeNumberRange {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choise;
		do {
			System.out.print("enter the 1st range : ");
			int n1= input.nextInt();
			System.out.print("enter the 2nd range : ");
			int n2= input.nextInt();
			int i;
			
			for(i=n1; i<=n2; i++) {
				
			int temp=0;
			for(int j=2; j<=i-1; j++) {
				
				if(i%j==0) {
					temp = temp+1;
				}
			}
			if(temp==0) {
				System.out.print(i + " ");
			}
			}
			System.out.println();
			System.out.println("Enter 1 for continue and 0 for exit : ");
			choise = input.nextInt();
		}
		while(choise == 1);
		
		System.out.println("--------Thank You---------");

	}

}
