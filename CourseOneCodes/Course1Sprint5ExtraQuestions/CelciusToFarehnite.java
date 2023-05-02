package Course1Sprint5ExtraQuestions;

public class CelciusToFarehnite {
	
	public void calciusToFarehnite(double cel) {

	    double fahrenheit=(cel*1.8) + (32);
		System.out.println(fahrenheit + "F in " + cel + "C " );
	}
	
	public void farehniteToCalcius(double far) {
        double calcius=(far-32)*5/9;
		System.out.println(calcius + "C in " + far + "F");
    }

	public static void main(String[] args) {
		
		CelciusToFarehnite c1 = new CelciusToFarehnite();
		c1.calciusToFarehnite(40);
		c1.farehniteToCalcius(104);

	}

}
