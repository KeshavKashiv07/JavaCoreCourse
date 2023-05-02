package Course1_Sprint3;

import java.util.Scanner;

public class AreaCalculator {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select the option from the list to calculate the area fence ");
		System.out.println("1. Square area for the chickens");
		System.out.println("2. circular area for ducks");
		System.out.println("3. Rectangular area for cows ");

		int number = sc.nextInt();

		switch(number) {
			case 1 : {
				System.out.println("Enter the side ");
				int side = sc.nextInt();
				int areaOfsqaure = side * side;
		        System.out.println("Area of square fence for the chickens : " + areaOfsqaure);
				break;
			}
			case 2 : {
				System.out.println("Enter the radius ");
				int radius = sc.nextInt();
				double areaOfcircular = (3.14)*(radius*radius);
		        System.out.println("Area of circle for the ducks : " + areaOfcircular);
				break;
			}
			case 3 : {
				System.out.println("Enter the length ");
				int length = sc.nextInt();
				System.out.println("Enter the width ");
				int width = sc.nextInt();
				int areaOfrectangle = length * width;
		        System.out.println("Area of rectangle for the cows : " + areaOfrectangle);
				break;
			}
			default : {
				System.out.println("invalid number");
			}
		}  
		
	}

}
