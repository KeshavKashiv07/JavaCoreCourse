package Course1_Sprint4;

import java.util.Scanner;

public class ReverseDigit {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		int reverse = 0;  
		
		if(num<0){
			System.out.println("Input cannot be negative");
		}
	    else
	    {
		   while(num>0)   
		   {  
			int remainder = num % 10; 
		    reverse = reverse * 10 + remainder;  
		    num = num/10; 
		    } 
		System.out.println("The reverse of the given number is: " + reverse);
	    }

	}

}
