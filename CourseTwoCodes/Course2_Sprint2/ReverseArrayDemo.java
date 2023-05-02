package Course2_Sprint2;


	public class ReverseArrayDemo {

		 public int[] getReverseArray(int []array){

		        int reversedArray[] = new int[array.length];
		        int j=0;
		        for (int i=array.length-1; i>=0; i--) {
		        reversedArray[j] = array[i];
		        j++;
		        }
		        return reversedArray;
		 }
		      
	    public static void main(String[] args) {
			ReverseArrayDemo obj = new ReverseArrayDemo();
			int array[] = {1,2,3,4,5,6,7,8,9,10};
	        int newArray[] = obj.getReverseArray(array);
	        
			for(int i=0;i<newArray.length;i++)
			System.out.print(newArray[i] + " " );

	    }

 }



