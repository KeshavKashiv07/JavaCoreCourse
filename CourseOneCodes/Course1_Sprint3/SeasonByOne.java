package Course1_Sprint3;

import java.util.Scanner;

public class SeasonByOne {
	
	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the month number : ");
			int month = input.nextInt();
			
			
			if(month == 11 || month == 12 || month == 1 ) {
				System.out.println("season is : Winter" );
			}
			else if(month == 2 || month == 3 || month == 4) {
				System.out.println("season is : Spring" );
			}
			else if(month == 5 || month == 6 || month == 7) {
				System.out.println("season is : Summer" );
			}
			else if(month == 8 || month == 9 || month == 10) {
				System.out.println("season is : Autumn" );
			}
			else {
				System.out.println("Worang month number");
			}

		}

}
