package Course1Sprint5ExtraQuestions;

public class GradeFunction {

	public String grades(int score) {
		if(score >=90) {
			return "A";
		}
		else if(score>=70 && score<90) {
			return "B";
		}
		else if(score>=50 && score<70) {
			return "C";
		}
		else {
			return "D";
		}
	}
	public static void main(String[] args) {
		GradeFunction g1 = new GradeFunction();
		String grade = g1.grades(99);
		
		System.out.println("Grade : " + grade);

	}

}
