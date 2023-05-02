package Course1_Sprint2;

public class SellingPrice {
	
	 public static void main(String[] args) {
			String itemName = "kaisa Bowl";
			double sellingPrice = 10.99;

			double newRate = (sellingPrice/100)*5;       // by this line we get the 5% intrest of last amt.
			sellingPrice = sellingPrice + newRate;

	        System.out.println("Recived Selling Price for Rounded " + itemName + " is " +"$"+ sellingPrice);
		}

}
