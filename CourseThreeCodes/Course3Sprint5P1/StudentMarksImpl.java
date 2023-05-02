package Course3Sprint5P1;

public class StudentMarksImpl {

    public static void main(String[] args) {

        StudentsMarks obj = new StudentsMarks();

        System.out.println("total marks in business studies : " + obj.calculateMarks(90,78) );
        System.out.println("total marks in medical : " + obj.calculateMarks(89,93,99,80));
        System.out.println("total marks in non-medical : " + obj.calculateMarks(80,90,70));
    }
}
