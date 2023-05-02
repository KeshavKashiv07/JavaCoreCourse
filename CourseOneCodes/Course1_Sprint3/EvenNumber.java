package Course1_Sprint3;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is even number and squar of this " + num*num);
		}
		else {
			System.out.println("Cube of number is : " + num*num*num);
		}

	}

}
