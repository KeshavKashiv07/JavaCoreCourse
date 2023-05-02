package Course3_Sprint1;

public class SavingAccountSimple {
	
	int age;
    String name;
    int Amount;
    long accountNumber;
    String accountStatus;

    public int WithdrawAmountFromBank(int amt) {
        Amount = Amount - amt;
        System.out.println("Withdraw success");
        return Amount;
    }

    public int depositAmmountToBank(int amt) {
        Amount = Amount + amt;
        System.out.println("Deposit success");
        return Amount;
    }

    public int checkBalance() {
        System.out.println("Your account balance is : "  + Amount);
        return Amount;
    }

    public void displayAccount() {
        System.out.println("------------------------------------------------------");
        System.out.println("Account number : " + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Main Balance : " + Amount);

    }


    public static void main(String[] args){
        SavingAccountSimple c1 = new SavingAccountSimple();
            c1.age=18;
            c1.name="Keshav Kashiv";
            c1.Amount=5000;
            c1.accountNumber=123456789123l;
            c1.accountStatus="Active";

            c1.WithdrawAmountFromBank(3000);

            c1.depositAmmountToBank(1000);

            c1.checkBalance();

            c1.displayAccount();

    }


}
