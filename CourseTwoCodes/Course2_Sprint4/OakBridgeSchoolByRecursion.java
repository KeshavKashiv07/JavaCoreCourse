package Course2_Sprint4;

public class OakBridgeSchoolByRecursion {
	
	 public int[] calculateTotalMarks(int [] math,int science[],int[] english)
	    {
		    int[] totalMarks = new int[math.length];
			int m=0;
			
			if(math.length==0 && science.length==0 && english.length==0) {
				return null;
			}
			
			else if(math.length==science.length && math.length==english.length && science.length==english.length) {
			for(int i=0,j=0,k=0; i<math.length; i++ ,j++ , k++) {
				totalMarks[m]= math[i] + science[j] + english[k];
				m++;
			}
			return totalMarks;
			}
			
			else {
				return null;
			}
			
	    }
	
	 public double calculateAverageScienceMarks (int[] science,int len)
	    {
		 double sum;
		 double avg;
			// {1,2,4}
		 
			if(len==1){
				sum=science[0];
			}
			else{                                                    
				sum= science[len-1]+ (len-1) * calculateAverageScienceMarks(science,len-1);
				//=4+2*f(s,2)  =18
				//f(s,2)=2+1*f(s,1)  =3
				//f(s,1)=1	
			}
			avg=sum/len;
			return avg;
	    }
	 
	 
	 public double calculateAverageEnglishMarks (int[] english,int len)
	    {
		 double sum=0;
		 double avg;
		 
		 if(len==1){
				sum=english[0];
			}
		 else {
		 sum= english[len-1]+ (len-1) * calculateAverageEnglishMarks(english,len-1);
		 }

		 avg = sum/len;
		 return avg;
	    }
	 
	 
	 public double calculateAverageMathMarks (int[] math,int len) 
	 { 
		 double sum=0;
		 double avg;
		 
		 if(len==1){	 
		 sum=math[0];
		 }
		 else {
		 sum= math[len-1]+ (len-1) * calculateAverageMathMarks(math,len-1);
		 }

		 avg = sum/len;
		 return avg;
	 }
	 
	 
	 public int findTopScore(int [] totalMarks,int len){
	        int max=0;
	        
	        if(len==1) {
	        	max=totalMarks[0];
	        	return max;
	        }
	        else {
	        	max = findTopScore(totalMarks, len-1); 
	        	
	        	if(max  > totalMarks[len-1])
	        	{
	        	return max;
	            }
	        		
	        }
	        return totalMarks[len-1];
	    }
	 
	 
	 

	public static void main(String[] args) {
		
		OakBridgeSchoolByRecursion obj = new OakBridgeSchoolByRecursion();
		
		int[] math  = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
		int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
		int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        int noOfSubjects = 3;
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        
        int totalMarks[] = obj.calculateTotalMarks(math,science,english);
        
        double avgScience = obj.calculateAverageScienceMarks(science, 10);
        System.out.println("Science " + avgScience);
        
        double avgEnglish = obj.calculateAverageEnglishMarks(english, 10);
        System.out.println("English "+avgEnglish);
        
        double avgMath = obj.calculateAverageMathMarks(math, 10);
        System.out.println("Math "+ avgMath);
        
        for(int i=0; i<totalMarks.length; i++) {
            System.out.print(totalMarks[i] + " ");
       }
        System.out.println();
        
        int topScore = obj.findTopScore(totalMarks, 10);
        System.out.println(topScore);

	}

}
