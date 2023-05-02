package Course1_Sprint4;

import java.util.Scanner;

public class Vote {
	
	public static void main(String args[]) {
	       Scanner input = new Scanner(System.in);
		   int last;
		   int count=0;
			do {
				System.out.print("enter the name : ");
				String name= input.next();
				System.out.print("enter the age  : ");
				int age= input.nextInt();

	            if(age >=18){
		            System.out.print("elegibel for vote ");
					count = count +1;
	            }
	           else
			   {
		            System.out.print("elegible not for vote ");
	           }


			System.out.println("Enter 1 for continue and 0 for last : ");
			last = input.nextInt();
		}
		while(last != 0);
		System.out.print("population is : " + count);
			
				System.out.println("--------Thank You---------");
		}

}
