package Course2_Sprint2;

public class OakBridgeSchoolWithTestCases {
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


    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int[] avgMarks = new int[totalMarks.length];
		
		int j=0;
		if(totalMarks.length==0 || noOfSubjects==0) {
			return null;
		}
		else {
		for(int i=0; i<totalMarks.length; i++) {
			avgMarks[j] = totalMarks[i]/noOfSubjects;
			j++;
		}
		return avgMarks;
		}
    }


    public int calculateAverageScienceMarks (int[] science)
    {
      int avgMarksOfScience;
		int sum=0;
		if(science.length == 0) {
			return -1;
		}
		else {
		for(int i=0; i<science.length; i++) {
			sum = sum+science[i];
		}
		avgMarksOfScience = sum/10;
		return avgMarksOfScience;
		}
    }


    public int calculateAverageEnglishMarks (int[] english)
    {
       int avgMarksOfEnglish;
		int sum=0;
		if(english.length == 0) {
			return -1;
		}
		else {
		for(int i=0; i<english.length; i++) {
			sum = sum+english[i];
		}
		avgMarksOfEnglish = sum/10;
		return avgMarksOfEnglish;	
		}
    }



    public int calculateAverageMathMarks (int[] math) {
     int avgMarksOfMaths;
		int sum=0;
		if(math.length == 0) {
			return -1;
		}
		else {
		for(int i=0; i<math.length; i++) {
			sum = sum+math[i];
		}
		
		avgMarksOfMaths = sum/10;
		return avgMarksOfMaths;	
		}
    }




    public static void main(String[] args) {
 
   //Object of OakBridgeSchool class is created
    	OakBridgeSchoolWithTestCases obj = new OakBridgeSchoolWithTestCases();

     // Initialize the arrays with 10 values of marks for each subject
        int [] math = {23,43,23,45,65,34,76,89,23,90};
        int [] science = {65,87,98,90,98,78,90,99,89,50};
        int [] english = {76,98,90,66,77,88,99,90,40,80};

     // The total number of subjects
        int noOfSubjects = 3;

     // Initialize names of 10 Students
        String[] studentNames = {"Keshav" , "Arun" , "Ankit" , "Mohan" , "Sohan" , "Ram" , "Luv" , "Amit" , "Sumit" , "Pardeep"};

     // Initialize roll numbers of 10 Students
        int [] rollNos = {10,21,23,34,56,57,89,30,102,77};

     // Call the methods to calculate total marks and average marks
        int totalMarks[] = obj.calculateTotalMarks(math,science,english);
        int [] averageMarks = obj.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);

     // Display the marks and average marks of each student
        System.out.println("-----------------------------------------------------");
        System.out.println("Student Name :: " + studentNames[1] + "||" + "Student Rollno :: " + rollNos[1]);
        System.out.println("Tota marks : " + totalMarks[1] + "/1000");
        System.out.println("Tota Average : " + averageMarks[1]);
        System.out.println("-----------------------------------------------------");

     // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = obj.calculateAverageScienceMarks(science);
        int averageMathMarks = obj.calculateAverageMathMarks(math);
        int averageEnglishMarks = obj.calculateAverageEnglishMarks(english);

     // Display the average marks scored by the class in subjects
        System.out.println("Average science markes by the class : " + averageScienceMarks);
        System.out.println("Average maths markes by the class : " + averageMathMarks);
        System.out.println("Average english markes by the class : " + averageEnglishMarks);
        




        // System.out.println("Total marks of all subjects : ");
        // for(int i=0; i<totalMarks.length; i++) {
        //      System.out.print(totalMarks[i] + " ");
        // }
        
        // System.out.println();
        
	    //  System.out.println("Total average marks of all subjects : ");
        // for(int i=0; i<totalMarks.length; i++) {
        //     System.out.print(averageMarks[i] + " ");
        // }
        
        // System.out.println();
        
		//  System.out.println("Average of each subjects : ");
        // System.out.println(averageScienceMarks);
        // System.out.println(averageMathMarks);
        // System.out.println(averageSocialMarks);


    }
}

