package Course3Sprint4.P2;

public class Engines {
	
	private String modelNumber;
	private int displacement;
	private int maxPower;
	private int maxRpm;
	
	
	
	public Engines(String modelNumber, int displacement, int maxPower, int maxRpm) {
		this.modelNumber = modelNumber;
		this.displacement = displacement;
		this.maxPower = maxPower;
		this.maxRpm = maxRpm;
	}



	public String getModelNumber() {
		return modelNumber;
	}



	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}



	public int getDisplacement() {
		return displacement;
	}



	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}



	public int getMaxPower() {
		return maxPower;
	}



	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}



	public int getMaxRpm() {
		return maxRpm;
	}



	public void setMaxRpm(int maxRpm) {
		this.maxRpm = maxRpm;
	}
	
	

}
 