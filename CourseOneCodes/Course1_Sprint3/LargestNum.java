package Course1_Sprint3;

import java.util.Scanner;

public class LargestNum {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the 1st number : ");
		int num1 = input.nextInt();
		System.out.print("Enter the 2nd number : ");
		int num2 = input.nextInt();
		System.out.print("Enter the 3rd number : ");
		int num3 = input.nextInt();
		
		int num4 = num3 > (num1>num2?num1:num2) ? num3 : (num1>num2?num1:num2);
		
		System.out.println("Largest number is : " + num4);		
	}

}
