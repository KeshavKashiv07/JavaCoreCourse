package Course1Sprint5;

import java.util.Scanner;

public class AreaCalculator {

		
		public double calculateAreaofSquare(double s) {
			double areaOfSquare = s*s;
			return areaOfSquare;
		}
		
		public double calculateAreaofCircle(double r) {
			double areaOfCircle = 3.14 * r * r;
			return areaOfCircle;
		}
		
		public double calculateAreaofRactangle(double l , double w) {
			double areaOfractangle = l*w;
			return areaOfractangle;
		}
		

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("enter the side of square : ");
			double side = input.nextDouble();
			
			System.out.println("enter the radius of circl : ");
			double radius = input.nextDouble();
			
			System.out.println("enter the length of rectangle : ");
			double length = input.nextDouble();
			System.out.println("enter the width of rectangle : ");
			double width = input.nextDouble();
			
			
			AreaCalculator obj = new AreaCalculator();
			
			double Square = obj.calculateAreaofSquare(side);
			double Circle = obj.calculateAreaofCircle(radius);
			double Ractangle = obj.calculateAreaofRactangle(length, width);
			
			System.out.println(" Area of Square is  : " + Square);
			System.out.println(" Area of Circle is  : " + Circle);
			System.out.println(" Area of ractangle is  : " + Ractangle);
			

		}

}
