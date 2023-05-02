package Course1Sprint5ExtraQuestions;

public class PlandromNumber {

	public static void main(String[] args) {
		
		int num = 252;
		int rev =0;
		int rem =0;
		
		int temp = num;
		
		while(num>0) {
		rem= num%10;
		rev = (rev*10) + rem;
		num = num/10;
		}
		System.out.println(rev);
		System.out.println(num);
		System.out.println(temp);
		
		if(rev == temp) {
			System.out.println("number is plandrom");
		}
		else {
			System.out.println("number is not plandrom");
		}

	}

}
