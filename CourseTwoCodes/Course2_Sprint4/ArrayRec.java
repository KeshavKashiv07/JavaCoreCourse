package Course2_Sprint4;

public class ArrayRec {

	 public int calculateAverageScienceMarks (int[] science,int len) {
		int sum=0;
		int avg;  
		
		if(len==1){      // {1,2,4}
			sum=science[0];
		}else{                                                    
			sum= science[len-1]+ (len-1) * calculateAverageScienceMarks(science,len-1);
			//=4+2*f(s,2)  = 18
			//f(s,2)=2+1*f(s,1) =3
			//f(s,1)=1	
		}
		avg=sum/len;
		return avg;
	 }
	 
	 
	public static void main(String[] args) {
	
		ArrayRec obj = new ArrayRec();
		int[] math  = {2,3,4};
		
		int sum = obj.calculateAverageScienceMarks(math, math.length);
		
		System.out.println(sum);

	}

}
