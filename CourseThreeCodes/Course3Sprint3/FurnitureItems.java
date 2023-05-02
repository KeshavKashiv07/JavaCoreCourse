package Course3Sprint3;

public class FurnitureItems {
	
	private String FurnitureCode;
	private String FurnitureType;
	private String FurnitureGrade; 
	private String FurnitureUsages;
	private int priceOfFurniture;
	
	static final int discount = 5;
	

	public FurnitureItems() {
		
	}

	
	
	public String getFurnitureCode() {
		return FurnitureCode;
	}
	
	public void setFurnitureCode(String furnitureCode) {
		this.FurnitureCode = furnitureCode;
	}

	public String getFurnitureType() {
		return FurnitureType;
	}

	public void setFurnitureType(String furnitureType) {
		this.FurnitureType = furnitureType;
	}
	
	public String getFurnitureGrade() {
		return FurnitureGrade;
	}

	public void setFurnitureGrade(String furnitureGrade) {
		this.FurnitureGrade = furnitureGrade;
	}

	public String getFurnitureUsages() {
		return FurnitureUsages;
	}

	public void setFurnitureUsages(String furnitureUsages) {
		this.FurnitureUsages = furnitureUsages;
	}

	public int getPriceOfFurniture() {
		return priceOfFurniture;
	}

	public void setPriceOfFurniture(int priceOfFurniture) {
		this.priceOfFurniture = priceOfFurniture;
	}

	
	
	public float calculateDiscount() {
		if(getFurnitureGrade() == "Grade1" && getFurnitureUsages() == "Outdoor") {
			return getPriceOfFurniture() - (discount/100f * getPriceOfFurniture() );
		}
		else {
			return getPriceOfFurniture();
		}
	}
	
	
	
	

	
	
	
    
}
