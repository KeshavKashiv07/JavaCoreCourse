package Course1_Sprint3;

import java.util.Scanner;

public class SeasonByTwo {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month number : ");
		int month = input.nextInt();
		
		switch(month) {
		
		case 11,12,1 : {
			System.out.println("season is : Winter");
			break;
			}
		case 2,3,4 : {
			System.out.println("season is : Spring");
			break;
			}
		case 5,6,7 : {
			System.out.println("season is : Summer");
			break;
			}
		case 8,9,10 : {
			System.out.println("season is : Autumn");
			break;
			}
		default : {
			System.out.println("Worang month number");
		    }
		}

	}

}
