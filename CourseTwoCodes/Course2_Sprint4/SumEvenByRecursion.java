package Course2_Sprint4;

public class SumEvenByRecursion {
	
	int sum=0;
	public int addEven(int num) {
		
		if(num <= 0) {
			return 0;
		}
		if(num%2==0) {
		  sum=sum+num;
		}
		addEven(num-1);
		return sum;
	}
	

	public static void main(String[] args) {
	
		SumEvenByRecursion obj = new SumEvenByRecursion();
		
		int sum = obj.addEven(20);
		System.out.println(sum);
		
     
	}

}
