package Course1_Sprint3;

import java.util.Scanner;

public class StudentsMarks {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the marks of english out of 100 : ");
		int english = input.nextInt();
		System.out.print("Enter the marks of hindi out of 100 : ");
		int hindi = input.nextInt();
		System.out.print("Enter the marks of english out of 100 : ");
		int maths = input.nextInt();
		
		int total_marks = english + hindi + maths;
		System.out.println("Total marks of all subjects is : " + total_marks);
		
		int total_avg = total_marks/3;
		
		
		if(total_avg >= 85) {
			System.out.println("Grade is : A" );
		}
		else if(total_avg >= 60 && total_avg < 85) {
			System.out.println("Grade is : B" );
		}
		else if(total_avg >= 45 && total_avg < 60) {
			System.out.println("Grade is : C" );
		}
		else{
			System.out.println("Grade is : D" );
		}

	}


}
