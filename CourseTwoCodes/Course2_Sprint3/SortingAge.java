 package Course2_Sprint3;

public class SortingAge {

public int[] getSortedAge(int [] ageArray){

//	 int len = ageArray.length;
//	   int temp=0;
//	   for(int i=0;i<len;i++){
//		   for(int j=0; j<len-i-1; j++){
//			   if(ageArray[j]<ageArray[j+1]){
//				   temp=ageArray[j];
//				   ageArray[j]=ageArray[j+1];
//				   ageArray[j+1]=temp;
//			   }
//		   }
//	   }
//	   return ageArray;
	
	
        
        for(int i=1; i<ageArray.length; ++i ){
			int key = ageArray[i];
			int j = i-1;
			while(j>=0 && ageArray[j] < key){
				ageArray[j+1] = ageArray[j];
				j=j-1;
			}
			ageArray[j+1] =key;
		}
          return ageArray;
    }

    public static void main(String[] args) {
        //Declare and initialize an integer array containing age.
		int[] age = {22,34,33,32,36,27,28};

        //Create an object of the class SortingAge
		SortingAge obj = new SortingAge();
        
		System.out.println("Descending order ");
        //Call the method getSortedAge and pass the parameter
		int sortedAge[] = obj.getSortedAge(age);
		
		for(int i=0;i<sortedAge.length;i++)
			System.out.print(sortedAge[i] + " " );



    }
}
