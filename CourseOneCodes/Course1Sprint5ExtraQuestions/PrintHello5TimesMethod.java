package Course1Sprint5ExtraQuestions;

public class PrintHello5TimesMethod {

	public void displayHello(int num) {
		System.out.println("Hello" + num);
	}
	public static void main(String[] args) {
		PrintHello5TimesMethod p1 = new PrintHello5TimesMethod();
		
		for(int i=1;i<=5;i++) {
			p1.displayHello(i);
		}

	}

}
