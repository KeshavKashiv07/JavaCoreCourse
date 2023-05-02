package Course3Sprint5P1;

public class StudentsMarks {

    public int calculateMarks(int math , int physics , int chemistry , int biology){
        int sum = math + physics + chemistry +biology;
        return sum;
    }

    public int calculateMarks(int math , int physics , int chemistry){
        int sum = math + physics + chemistry;
        return sum;
    }
    public int calculateMarks(int finance , int accounting){
        int sum = finance +accounting;
        return sum;
    }

}
