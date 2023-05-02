package Course1_Sprint4;

import java.util.Scanner;

public class EvenOddSum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the eight digit number : ");
		int num = input.nextInt();
		 
		int sum_even=0;
		int sum_odd=0;
		
		if(num<0){
			System.out.println("Input cannot be negative");
		}
	    else
	    {
		 while(num>0)   
		   {  
			int remainder = num % 10; 
			
			if(remainder%2==0) {
			sum_even = sum_even + remainder;
			}
			else {
			sum_odd = sum_odd+ remainder;
			}
			
		   num = num/10; 
		    
		    } 
		System.out.println("The sum of even digits is : " + sum_even);
		System.out.println("The sum of odd digits is : " + sum_odd);
	    }

	}


}
