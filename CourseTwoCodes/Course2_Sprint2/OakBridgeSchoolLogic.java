package Course2_Sprint2;

public class OakBridgeSchoolLogic {

	public int[] calculateTotalMarks(int[] maths , int[] science , int[] social) {
		
		int[] totalMarks = new int[maths.length];
		int m=0;
		for(int i=0,j=0,k=0; i<maths.length; i++ ,j++ , k++) {
			totalMarks[m]= maths[i] + science[j] + social[k];
			m++;
		}
		return totalMarks;
		
	}
	
	
	public int[] calculateTotalAverageMarkesforEachStudent(int[] totalMarks , int noOfStudent) {
		int[] avgMarks = new int[totalMarks.length];
		
		int j=0;
		for(int i=0; i<totalMarks.length; i++) {
			avgMarks[j] = totalMarks[i]/noOfStudent;
			j++;
		}
		return avgMarks;
	}
	
	
	
	public int calculateAverageScienceMarks(int[] science) {
		int avgMarksOfScience=0;
		int sum=0;
		for(int i=0; i<science.length; i++) {
			sum = sum+science[i];
		}
		avgMarksOfScience = sum/10;
		return avgMarksOfScience;	
	}
	
	
	public int calculateAverageMathsMarks(int[] maths) {
		int avgMarksOfMaths=0;
		int sum=0;
		for(int i=0; i<maths.length; i++) {
			sum = sum+maths[i];
		}
		avgMarksOfMaths = sum/10;
		return avgMarksOfMaths;	
	}
	
	
	public int calculateAverageSocialMarks(int[] social) {
		int avgMarksOfSocial=0;
		int sum=0;
		for(int i=0; i<social.length; i++) {
			sum = sum+social[i];
		}
		avgMarksOfSocial = sum/10;
		return avgMarksOfSocial;	
	}
	
	public static void main(String[] args) {
		
//		 //Object of OakBridgeSchool class is created
		OakBridgeSchoolLogic obj = new OakBridgeSchoolLogic();
//        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {23,43,23};
        int [] science = {65,87,98};
        int [] social = {76,98,90};
//        // The total number of subjects
        int noOfSubjects = 3;
//        // Initialize names of 10 Students
        String[] studentNames = {"Keshav" , "Arun" , "Ankit" , "Mohan" , "Sohan" , "Ram" , "Luv" , "Amit" , "Sumit" , "Pardeep"};
//        // Initialize roll numbers of 10 Students
        int [] rollNos = {10,21,23,34,56,57,89,30,102,77};
//        // Call the methods to calculate total marks and average marks
        int totalMarks[] = obj.calculateTotalMarks(math,science,social);
        int [] averageMarks = obj.calculateTotalAverageMarkesforEachStudent(totalMarks,noOfSubjects);
//        // Display the marks and average marks of each student
        System.out.println("-----------------------------------------------------");
        System.out.println("Student Name :: " + studentNames[1] + "||" + "Student Rollno :: " + rollNos[1]);
        System.out.println("Tota marks : " + totalMarks[1] + "/1000");
        System.out.println("Tota Average : " + averageMarks[1]);
        System.out.println("-----------------------------------------------------");

//        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = obj.calculateAverageScienceMarks(science);
        int averageMathMarks = obj.calculateAverageMathsMarks(math);
        int averageSocialMarks = obj.calculateAverageSocialMarks(social);

        // Display the average marks scored by the class in subjects
        System.out.println("Average science markes by the class : " + averageScienceMarks);
        System.out.println("Average maths markes by the class : " + averageMathMarks);
        System.out.println("Average social markes by the class : " + averageSocialMarks);
        
        
        for(int i=0; i<totalMarks.length; i++) {
             System.out.println(totalMarks[i] + " ");
        }
        
        System.out.println();
        
        for(int i=0; i<totalMarks.length; i++) {
            System.out.println(averageMarks[i] + " ");
        }
        
        System.out.println();
        
        System.out.println(averageScienceMarks);
        System.out.println(averageMathMarks);
        System.out.println(averageSocialMarks);
		
	}

}
