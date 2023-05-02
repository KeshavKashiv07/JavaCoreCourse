package Course3Sprint2;

public class SavingAccountImpl {
    public static void main(String[] args) {

        SavingAccount c1;
        c1=new SavingAccount(18, "keshav", 5000, 123456789012l, "Active");

        System.out.println(c1.cratedCash(2000) + "Crated Amount Successfully");
        System.out.println(c1.debitCash(4000) + "Debited Amount Successfully");
        System.out.println("Your main balance is " + c1.checkBalance());


    }
}
