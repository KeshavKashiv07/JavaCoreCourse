package Course3_Sprint1;

public class FurnitureItem {

	boolean isOutdoor;
	String grade;
	String colour;
	String nameOfItem;
	int priceOfFurniture;
	
	public float discountOnOutdoorItems(int price) {
		float discount;
		float totalPriceWithdiscount;
		
		if(isOutdoor==true) {
			discount = price*(5f/100);
			totalPriceWithdiscount = price-discount;
			return totalPriceWithdiscount;
		}
		else {
			return price;
			
		}
		 
	}
	
	public static void main(String[] args) {
		FurnitureItem c1 = new FurnitureItem();
		c1.isOutdoor=true;
		c1.grade="A1";
		c1.colour="rad";
		c1.nameOfItem="cahir";
		c1.priceOfFurniture= 600;
		
		System.out.println("total bill after discount for customer 1 :-  " + c1.discountOnOutdoorItems(c1.priceOfFurniture));
		
		
		
		FurnitureItem c2 = new FurnitureItem();
		c2.isOutdoor=false;
		c2.grade="A1";
		c2.colour="blue";
		c2.nameOfItem="stools";
		c2.priceOfFurniture= 400;
		
		System.out.println("total bill after discount for customer 2 :-  " + c2.discountOnOutdoorItems(c2.priceOfFurniture));
		
		

	}

}
