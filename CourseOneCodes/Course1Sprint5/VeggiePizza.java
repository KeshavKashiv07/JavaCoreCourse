package Course1Sprint5;

import java.util.Scanner;

public class VeggiePizza {

	public void displayCoustmerDetails(String name, String email, long phoneNo, String address) {
		System.out.println("----- Coustmer Details -----");
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("phoneNo : " + phoneNo);
		System.out.println("Address : " + address);
	}
	
	public void displayMenu() {
		System.out.println();
		System.out.println("Select the item to order");
		System.out.println("Sl No               Item category");
		System.out.println("------------------------------------");
		System.out.println("1) Pizza");
		System.out.println("   Price of one Regural pizza : $9.99");
		System.out.println("   Price of one Medium pizza :  $11.99");
		System.out.println("   Price of one Large pizza : $13.99");
		System.out.println("2) Garlic Bread");
		System.out.println("   Price of one Garlic Bread : $5.99");
		System.out.println("3) Bevrages");
		System.out.println("   Price of one Bevrages : $1.99");
		System.out.println();
		
	}
	
	public float getPizzaPriceBasedOnSize(int size) {
		float prizeOfPizza = 0;
		if(size == 1) {
			prizeOfPizza = 9.99f;
		}
		else if(size == 2) {
			prizeOfPizza = 11.99f;
		}
		else if(size == 3) {
			prizeOfPizza = 13.99f;
		}
		else {
			System.out.println("Invalid size, enter 1 , 2 and 3");
			 prizeOfPizza = 0;
		}
		return prizeOfPizza;
	}
	
	public float getGarlicBreadPrice() {
		float GarlicBreadPrice;
		return GarlicBreadPrice = 5.99f;
	}
	
	public float getBrevragesPrice() {
		float BreveragesPrice;
		return BreveragesPrice = 1.99f;
	}
	
	public float prizeOfPizz(int noOfPizza , float PriceOfPizza) {
		float pizzaPrice = noOfPizza * PriceOfPizza;
		return pizzaPrice;
	}
	
	public float prizeOfGarlicBread(int noOfGarlicBreada , float PriceOfGarlicBread) {
		float GarlicBreadPrice = noOfGarlicBreada * PriceOfGarlicBread;
		return GarlicBreadPrice;
	}
	
	public float prizeOfBrevrages(int noOfBrevrages , float PriceOfBrevrages) {
		float BrevragesPrice = noOfBrevrages * PriceOfBrevrages;
		return BrevragesPrice;
	}
	
	public float calculateTotalBill(float totalPizzaPrice, float totalGarlicBreadPrice, float totalBrevragesPrice) {
		float totalBill = totalPizzaPrice + totalGarlicBreadPrice + totalBrevragesPrice;
		return totalBill;
	}
	
	public float calculateTotaDiscontedBill(float totalBillAmount) {
		float discount = (10/100f) * totalBillAmount;
		float discountedBill=0;
		
		if(totalBillAmount > 50) {
			discountedBill = totalBillAmount - discount;
			return discountedBill;
		}
		else {
			//System.out.println("total bill amount is less then $50 for discount ");
			return totalBillAmount;
		}
	}
	
	public void displayOrderDetaills(int noOfPizza , int noOfGarlicBreada , int noOfBrevrages , int size , float totalPrice , float totalDiscountedBill ) {
		System.out.println();
		System.out.println("Order details");
		System.out.println("--------------");
		System.out.println("Number of pizza order :       " + noOfPizza);
		System.out.println("Number of Garlic Bread order :       " + noOfGarlicBreada);
		System.out.println("Number of Brevrages order :       " + noOfBrevrages);
		System.out.println("-----------------------------------------------------");
		System.out.println("Total bill amount is :   " + totalPrice);
		System.out.println("Total discounted bill is :   " + totalDiscountedBill);
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VeggiePizza obj = new VeggiePizza();
		
		int pizzaSize=0;
		float pizzaRate =0;
		float garlicBreadRate=0 ;
		float brevragesRate=0;
		
		int pizzaOrdered=0;
		int GarlicBreadOrdered=0;
		int BrevragesOrdered=0;
		
		float totalPizzaPrice=0;
		float totalGarlicBreadPrice=0;
		float totalBrevragesPrice=0; 
		
		float totalBill;
		float totalDiscountedBill;
		
		int choice;
		
		System.out.println("Enter the name of customer");
		String customerName = input.next();
		System.out.println("Enter the email of customer");
		String customerEmail = input.next();
		System.out.println("Enter the phone number of customer");
		long customerPhoneNo = input.nextLong();
		System.out.println("Enter the addres of customer");
		String customerAdd = input.next();
		
		System.out.println();
		obj.displayCoustmerDetails(customerName, customerEmail, customerPhoneNo, customerAdd);
		obj.displayMenu();
		System.out.println();
		
		
		do {
		System.out.println("Enter 1 for Pizza or 2 for GarlicBraed and 3 for Bevrages");
		int number = input.nextInt();
		
		switch(number) {
		case 1: { 
			System.out.println("Enter the Size of Pizza You Went to Order : ");
			pizzaSize = input.nextInt();
			
			pizzaRate = obj.getPizzaPriceBasedOnSize(pizzaSize);
			
			System.out.println("enter the number of pizza you went to order");
			pizzaOrdered = input.nextInt();
			
			totalPizzaPrice = obj.prizeOfPizz(pizzaOrdered, pizzaRate);
			break;
		}
		case 2 : {
			garlicBreadRate = obj.getGarlicBreadPrice();
			
			System.out.println("enter the number of GarlicBread you went to order");
			GarlicBreadOrdered = input.nextInt();
			
			totalGarlicBreadPrice = obj.prizeOfGarlicBread(GarlicBreadOrdered, garlicBreadRate);
			break;
		}
		case 3 : {
			brevragesRate = obj.getBrevragesPrice();
			
			System.out.println("enter the number of Brevrages you went to order");
			BrevragesOrdered = input.nextInt();
			
			totalBrevragesPrice = obj.prizeOfBrevrages(BrevragesOrdered, brevragesRate);
			break;
		}
		default : {
			System.out.println("Invalid number, number must be 1 , 2 and 3");
		 }
		}
		System.out.println("Enter 1 for continue and enter 0 for exit");
		choice = input.nextInt();
		
		}
		while(choice !=0);
		
		totalBill = obj.calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBrevragesPrice);
		totalDiscountedBill = obj.calculateTotaDiscontedBill(totalBill);
		
		obj.displayOrderDetaills(pizzaOrdered, GarlicBreadOrdered, BrevragesOrdered, pizzaSize, totalBill, totalDiscountedBill);
		
		System.out.println("---------------Thank you---------------------");
		
	}

}
