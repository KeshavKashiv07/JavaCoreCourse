package Course1_Sprint4;

import java.util.Scanner;

public class LeepYear {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choise;
	do {	
		System.out.println("enter the year ");
		int year = input.nextInt();
		
		if(year%4==0){
			System.out.println("This is leep year");
		}
		else{
			System.out.println("this is not a leep year");
		}
		
		System.out.println("Enter 1 for continue and 0 for exit : ");
		choise = input.nextInt();
	}
	while(choise != 0);
	
	System.out.println("--------Thank You---------");

	}

}
