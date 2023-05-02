package Course1_Sprint4;

import java.util.Scanner;

public class TableOfNumber {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choise;
	do {	
		System.out.println("enter the number ");
		int n1 = input.nextInt();
		
		for(int i=1; i<=10;i++)
		System.out.println(n1 + " * " + i + " = " + (n1*i));
		System.out.println("Enter 1 for continue and 0 for exit : ");
		choise = input.nextInt();
	}
	while(choise == 1);
	
	System.out.println("--------Thank You---------");


	}
}
