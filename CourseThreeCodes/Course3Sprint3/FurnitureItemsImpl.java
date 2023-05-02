package Course3Sprint3;

public class FurnitureItemsImpl {

	public static void main(String[] args) {
		
		FurnitureItems c1 = new FurnitureItems();
		
		c1.setFurnitureCode("A123");
		c1.setFurnitureType("Table");
		c1.setFurnitureGrade("Grade1");
		c1.setFurnitureUsages("Outdoor");
		c1.setPriceOfFurniture(1000);
		
		System.out.println("Discounted price : " + c1.calculateDiscount());

	}

}
