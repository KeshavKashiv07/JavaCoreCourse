package Course1_Sprint4;

public class EvenOddCount {

public static void main(String[] args) {
		
		int even_count=0;
		int odd_count=0;
		
		for(int i=1; i<=30; i++) {
			
			if(i%2==0) {
				even_count = even_count + 1;
			}
			else {
				odd_count= odd_count+1;
			}
		}

		System.out.println("Count of even numbers : " + even_count);
		System.out.println("Count of odd numbers : " + odd_count);
	}

}
