package Course1_Sprint4;

import java.util.Scanner;

public class TempratureConverter {
	
	public static void main(String args[]) {
	       Scanner input = new Scanner(System.in);
		   int last;
		   double fahrenheit=0;
			do {
				System.out.print("enter the temprature in celsius : ");
				int temp= input.nextInt();

	            fahrenheit=(temp*1.8) + (32);
				System.out.println(fahrenheit + "F");


			System.out.println("Enter 1 for continue and 0 for last : ");
			last = input.nextInt();
		    }
		    while(last != 0);
			
				System.out.println("--------Thank You---------");
		}

}
