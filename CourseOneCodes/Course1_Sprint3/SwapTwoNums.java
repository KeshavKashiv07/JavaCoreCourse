package Course1_Sprint3;

import java.util.Scanner;

public class SwapTwoNums {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the 1st number : ");
		int num1 = sc.nextInt();

		System.out.print("Enter the 2nd number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Befor Swap the Numbers is a = " + num1 + " and b = " + num2);

		int swap;
		swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("Befor Swap the Numbers is a = " + num1 + " and b = " + num2);
	}


}
