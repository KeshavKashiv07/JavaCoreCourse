package Course1_Sprint2;

public class PizzaOrder {
	
	 public static void main(String[] args) {
		    
	       String coustomerName = "Gary";
		   String coustomerEmail = "gary@123.com";
		   long phoneNo = 412312345L;
		   String address = "20, Marble Drive, Eville";

		   int noOfPizzasOrdered = 5;
		   float pizzaPrice = 12.5f;
		   char pizzaSize = 'M';

		   int noOfGarlicBreadOrdered = 3;
		   float garlicBreadPrice = 5.99f;

		   int noOfBeveragesOrdered = 3;
		   float beveragePrice = 1.99f;


		   float total_pizza_price = noOfPizzasOrdered * pizzaPrice;
		   float total_garlicBread_price = noOfGarlicBreadOrdered * garlicBreadPrice;
		   float total_beverage_price = noOfBeveragesOrdered * beveragePrice;

		   float total_bill_amt = total_pizza_price + total_garlicBread_price + total_beverage_price;
		   boolean result = total_bill_amt >= 100 ;
	       float total_discount = (10f/100)*total_bill_amt;                 // (10/100)*total_bill for 10% of discount
	       float total_paid_amt = total_bill_amt - total_discount;

	       System.out.println("------------------------");
		   System.out.println("  Customer Details  ");
		   System.out.println("------------------------");

		   System.out.println("Coustmer Name : " + coustomerName);
		   System.out.println("Coustmer Phone Number : " + phoneNo);
		   System.out.println("Coustmer Email : " + coustomerEmail);
		   System.out.println("Coustmer Address : " + address);

		   System.out.println();
		   System.out.println();
		   
		   System.out.println("------------------------");
		   System.out.println("  Order Summary ");
		   System.out.println("------------------------");
		   System.out.println();

		   System.out.println("Sr no.    ItemName    ItemQuantity    $Price/Unit    $TotalPrice ");
		   System.out.println("-----------------------------------------------------------------");
		   System.out.println("1         Pizza           " + noOfPizzasOrdered +"            " + pizzaPrice + "            " + total_pizza_price);
		   System.out.println("2         Garlic Bread    " + noOfGarlicBreadOrdered +"            " + garlicBreadPrice + "            " + total_garlicBread_price);
		   System.out.println("3         Baverages       " + noOfBeveragesOrdered +"            " + beveragePrice + "            " + total_beverage_price);
	       System.out.println("-----------------------------------------------------------------");

		   System.out.println("Total Bill Amount: $" + total_bill_amt);
		   System.out.println("Discount offered : " + "10%");
		   System.out.println("Amount to be paid: $" + total_paid_amt);
		   System.out.println();

		   System.out.println("------------------Thank You---------------------------------------");

     
  }

}
