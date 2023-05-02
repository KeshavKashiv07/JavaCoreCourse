package Course1Sprint5ExtraQuestions;

public class CalcutatorMethod {

	public double sum(double a , double b) {
		return a+b;
	}
	
	public double sub(double a , double b) {
		return a-b;
	}
	
	public double product(double a , double b) {
		return a*b;
	}
	
	public double div(double a , double b) {
		return a/b;
	}
	public static void main(String[] args) {
		
		CalcutatorMethod c1 = new CalcutatorMethod();
		
		System.out.println("Sum : " + c1.sum(45, 34));
		System.out.println("Subtract : " + c1.sub(45, 34));
		System.out.println("Multiplication : " + c1.product(45, 34));
		System.out.println("Divide : " + c1.div(45, 34));

	}

}
