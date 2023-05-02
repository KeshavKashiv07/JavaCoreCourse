package Course1_Sprint3;

import java.util.Scanner;

public class PizzaOrder {
	
	public static void main(String args[]) {
	      Scanner input = new Scanner(System.in);
	      System.out.println("!! Welcome !!");
		  System.out.println("Enter customer details for placing an order");

		  System.out.println("Enter the name");
		  String coustomerName = input.nextLine();

		  System.out.println("Enter the email");
		  String coustomerEmail = input.nextLine();

		  System.out.println("Enter the contact number");
		  long coustmerPh = input.nextLong();

		  System.out.println("Enter the addres");
	      String coustomerAdd = input.nextLine();

	      System.out.println();

		  System.out.println("!!! Thank you for providing your details !!!");

	      System.out.println();

		  System.out.println("Select the item from the main menu");

		  System.out.println();
		

	      System.out.println("Sl No        Item Category");
		  System.out.println("---------------------------");
	      System.out.println("1.           Pizza");
		  System.out.println("2.           Garlic Bread");
		  System.out.println("3.           Brevrages ");
		  System.out.println("Enter 1 for pizza , 2 for Garlic Bread and 3 for Brevrages");
	      int Num= input.nextInt();

			switch(Num) {
				case 1 : {
					System.out.println("Enter the numbre of pizza you want to order ");
					int noOfPizzasOrdered = input.nextInt();
					float pizzaPrice = 12.99f;
					float total_pizza_price = noOfPizzasOrdered * pizzaPrice;
			        System.out.println("Your total pizza bill is : $" + total_pizza_price);
					break;
				}
				case 2 : {
					System.out.println("Enter the numbre of Garlic Bread you want to order ");
					int noOfGarlicBreadOrdered = input.nextInt();
					float garlicBreadPrice = 5.99f;
					float total_garlicBread_price = noOfGarlicBreadOrdered * garlicBreadPrice;
			        System.out.println("Your total garlic Bread bill is : $" + total_garlicBread_price);
					break;
				}
				case 3 : {
					System.out.println("Enter the numbre of Brevrages you want to order ");
					int noOfBeveragesOrdered = input.nextInt();
					float beveragePrice = 1.99f;
					float total_beverage_price = noOfBeveragesOrdered * beveragePrice;
			        System.out.println("Your total Brevrages bill is : $" + total_beverage_price);
					break;
				}
				default : {
					System.out.println("invalid number");
				} 
			}

		}

}
