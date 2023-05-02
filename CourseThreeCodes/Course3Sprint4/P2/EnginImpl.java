package Course3Sprint4.P2;

public class EnginImpl {

	public static void main(String[] args) {

		
		
		PetrolEngin pc = new PetrolEngin("P965076", 2755, 201, 3400, "Fortuner white","Petrol");
		pc.displayCars();
		
		DieselEngin dc = new DieselEngin("D12345", 3000, 225, 4000,"Fortuner Black", "Diesel");
		dc.displayCars();
		
		CngEngin cng = new CngEngin("C12345", 2500, 185, 3000,"Shiwf Black", "Cng");
		cng.displayCars();
		
		ElectricalEngin ec = new ElectricalEngin("E12345", 2800, 225, 3800,"MG", "Electrical");
		ec.displayCars();
		
		

	}

}
