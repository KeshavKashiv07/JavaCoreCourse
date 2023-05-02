package Course3Sprint4.P2;

public class CngEngin extends Engines {
	
	private String name;
	private String varient;
	
       public CngEngin(String modelNumber, int displacement, int maxPower, int maxRpm ,String name,  String varient) {
		
		super(modelNumber, displacement, maxPower, maxRpm);
		this.name = name;
		this.varient=varient;
		
	}
       
       public void displayCars() {
   		System.out.println("--------------------------------------------------------------");
   		System.out.println("Modle number : " + getModelNumber() );
   		System.out.println("Car Displacement : " + getDisplacement() + " cc");
   		System.out.println("Car maximum power : " + getMaxPower() + " pbh");
   		System.out.println("Car maximum revolutions per minute(RPM) : " + getMaxRpm() + " rpm");
   		System.out.println("Car name : " + name);
   		System.out.println("Car varient : " + varient);
   		System.out.println("--------------------------------------------------------------");
   	}

}
