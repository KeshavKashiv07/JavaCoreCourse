package Course3Sprint3;

public class Voter {

    private String name;
    private int age;

    final static int Voter_Eligible_Age = 18;

   public Voter(){
      this.name=getName();
      this.age=getAge();
    }

     public void setName(String name){
        this.name=name;
     }

     public void setAge(int age) {
        this.age=age;
     }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public String getAgeCritreria(){
        if(Voter_Eligible_Age <= getAge()){
            return getName() + " is Eligibale to vote";
        }
        else if (0 >= getAge()) {
            return "Age can not be Negative or Zero";
        }
        else{
            return getName() + " is not Eligibale to vote";
        }

}

}
