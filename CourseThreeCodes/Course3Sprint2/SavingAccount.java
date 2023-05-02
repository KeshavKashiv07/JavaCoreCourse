package Course3Sprint2 ;

public class SavingAccount {

    int age;
    String name;
    int balance;
    long accountNumber;
    String accountStatus;

    SavingAccount(int age , String name , int balance , long accountNumber , String accountStatus){
        this.age=age;
        this.name=name;
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.accountStatus=accountStatus;
    }
    int checkBalance(){
        return balance;
    }

    int debitCash( int debitAmount){
        balance = balance-debitAmount;
        return balance;
    }

    int cratedCash(int cratedAmount){
        balance= balance+cratedAmount;
        return balance;
    }

}
