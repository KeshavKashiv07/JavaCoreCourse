package Course1Sprint5;

import java.util.Scanner;

public class WeightedAverage {
	Scanner input = new Scanner(System.in);
	
	public void calculateWeightedAverage() {
		
		
		System.out.println("Enter the assignment weight ");
		int assignmentWeight = input.nextInt();
		
		System.out.println("Enter the project weight ");
		int projecttWeight = input.nextInt();
		
		System.out.println("Enter the quize weight ");
		int quizWeight = input.nextInt();
		
		System.out.println("Enter the mid term weight ");
		int midTremWeight = input.nextInt();
		
		System.out.println("Enter the final exam weight ");
		int finalExamWeight = input.nextInt();
		
		System.out.println("Enter the assignment score ");
		int assignmentScore = input.nextInt();
		
		System.out.println("Enter the quiz score ");
		int quizScore = input.nextInt();
		
		System.out.println("Enter the project score ");
		int projectScore = input.nextInt();
		
		System.out.println("Enter the mid tream score ");
		int midTremScore = input.nextInt();
		
		System.out.println("Enter the final exam score ");
		int finalExamScore = input.nextInt();
		
		float assignmentPersentageScore = ( assignmentWeight/100f ) * assignmentScore;
		float quizPersentageScore = ( quizWeight/100f ) * quizScore;
		float projectPersentageScore = ( projecttWeight/100f ) * projectScore;
		float midTremPersentageScore = ( midTremWeight/100f ) * midTremScore;
		float finalExamPersentageScore = ( finalExamWeight/100f ) * finalExamScore;
		float overAllPersentage = assignmentPersentageScore + projectPersentageScore + quizPersentageScore + midTremPersentageScore + finalExamPersentageScore;
		
		System.out.println();
		
		 System.out.println("Weight            % value of score ");
		 System.out.println("Assignment weight" + "       " + assignmentPersentageScore);
		 System.out.println("Quiz weight" + "       " + quizPersentageScore);
		 System.out.println("Project weight" + "       " + projectPersentageScore);
		 System.out.println("mid trem weight" + "       " + midTremPersentageScore);
		 System.out.println("Final exam weight" + "       " + finalExamPersentageScore);
		 
		 System.out.println();
		 
		 System.out.println("The weighted average score is : " + overAllPersentage);
		
	}
		
	
	public static void main(String[] args) {
		
		WeightedAverage obj = new WeightedAverage();
		obj.calculateWeightedAverage();

	}

}
