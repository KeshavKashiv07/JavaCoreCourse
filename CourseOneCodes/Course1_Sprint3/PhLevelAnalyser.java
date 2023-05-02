package Course1_Sprint3;

import java.util.Scanner;

public class PhLevelAnalyser {
	
	public static void main(String args[]) {

	     Scanner sc = new Scanner(System.in);

		 System.out.println("Enter the Phlevel ");
		 int pHlevel = sc.nextInt();

		 if(pHlevel < 7) {
			 System.out.println("pH value is low, partial water change required. ");
		 }
		 else if(pHlevel == 7 || pHlevel == 8) {
			 System.out.println("pH value is fine");
		 }
		  else if(pHlevel > 8) {
			 System.out.println("pH value is high, partial water change required. ");
		 }

		}

}
