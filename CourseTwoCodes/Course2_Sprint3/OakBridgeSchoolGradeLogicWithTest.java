package Course2_Sprint3;

public class OakBridgeSchoolGradeLogicWithTest {

	 public int[] calculateTotalMarks(int [] math,int science[],int[] english)
	    {
			int[] totalMarks = new int[math.length];
			int m=0;
			for(int i=0,j=0,k=0; i<math.length; i++ ,j++ , k++) {
				totalMarks[m]= math[i] + science[j] + english[k];
				m++;
			}
			return totalMarks;
	    }
	 
	 public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
	        
		 int[] avgMarks = new int[totalMarks.length];
			
			int j=0;
			for(int i=0; i<totalMarks.length; i++) {
				avgMarks[j] = totalMarks[i]/noOfSubjects;
				j++;
			}
			return avgMarks;
	    }
	 
	 
	 public char findGradeInMath(int math){
	        //char mathGrade;
	        
	        if(math >=90) {
	        	return 'A';
	        }
	        else if(math >=80 && math <=89) {
	        	return 'B';
	        }
	        else if(math >=70 && math <=79) {
	        	return 'C';
	        }
	        else if(math >=60 && math <=69) {
	        	return 'D';
	        }
	        else {
	        	return 'F';
	        }
	    }
	 
	 
	 public char findGradeInScience(int science){
	       // char scienceGrade = '\u0000';
		 if(science >=90) {
	        	return 'A';
	        }
	        else if(science >=80 && science <=89) {
	        	return 'B';
	        }
	        else if(science >=70 && science <=79) {
	        	return 'C';
	        }
	        else if(science >=60 && science <=69) {
	        	return 'D';
	        }
	        else {
	        	return 'F';
	        }
	    }
	 
	 
	 public char findGradeInEnglish(int english){
	       // char englishGrade = '\u0000';
		 if(english >=90) {
	        	return 'A';
	        }
	        else if(english >=80 && english <=89) {
	        	return 'B';
	        }
	        else if(english >=70 && english <=79) {
	        	return 'C';
	        }
	        else if(english >=60 && english <=69) {
	        	return 'D';
	        }
	        else {
	        	return 'F';
	        }
	    }
	 
	 
	 
	 public int[] sortByTotalMarks(int[] totalMarks)
	    {
		 for(int i=1; i<totalMarks.length; ++i ){
				int key = totalMarks[i];
				int j = i-1;
				while(j>=0 && totalMarks[j] < key){
					totalMarks[j+1] = totalMarks[j];
					j=j-1;
				}
				totalMarks[j+1] =key;
			}
	          return totalMarks;
	    }
	 
	 
	 public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo ){
		 
		 System.out.println("*******************************");
		 System.out.println("Grading and Evaluation");
		 System.out.println("*******************************");
		 System.out.println("----------------------------------------------------------");
		 System.out.println("Student Name               Roll no");
		 System.out.println("----------------------------------------------------------");
		 System.out.println(studentName + "                    " + rollNo);
		 System.out.println("Total marked scored :  " +      totalMark);
		 System.out.println("Total average marked scored :  " +      averageMark);
		 System.out.println("----------------------------------------------------------");
		 System.out.println();
		 System.out.println("Grade in Maths : " + mathGrade);
		 System.out.println("Grade in science : " + scienceGrade);
		 System.out.println("Grade in english : " + englishGrade);
		 System.out.println();
		 System.out.println("----------------------------------------------------------");


	    }
	 
	 
	 public static void main(String args[]) {
		 
		 OakBridgeSchoolGradeLogicWithTest obj = new OakBridgeSchoolGradeLogicWithTest();
		 
		 int[] math  = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
		 int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
		 int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
		 int noOfSubjects = 3;
		 String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
		 int[]  rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
		 
		 
		 int[] totalMarks = obj.calculateTotalMarks(math, science, english);
		 int[] avgMarks = obj.calculateTotalAverageMarksForEachStudent(totalMarks, noOfSubjects);
		 
		 char mathGrade = obj.findGradeInMath(70);
		 char scienceGrade = obj.findGradeInScience(90);
		 char englisgGrade = obj.findGradeInEnglish(23);
		 
		 obj.displayDetails(totalMarks[0], avgMarks[0], mathGrade, scienceGrade, englisgGrade, studentNames[0], rollNos[0]);
		 
		 
		 System.out.println("----------------------------");
		 System.out.println("Report");
		 System.out.println("----------------------------");
		 System.out.println("Total marks of the class in sorted order ");
		 
		 int[] sortedTotalMarks = obj.sortByTotalMarks(totalMarks);
		 for(int i=0; i<sortedTotalMarks.length; i++) {
		 System.out.println(sortedTotalMarks[i]);
		 }
	 }

}
