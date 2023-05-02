package Course3_Sprint1;

import java.util.Random;
import java.util.Scanner;

public class SavingBankAccount {
	int age;
	String name;
	int Ammount;
	
	public int WithdrawAmmountFromBank(int amt) {
		Ammount = Ammount - amt;
		System.out.println("Withdraw success");
		return Ammount;
	}
	
	public int depositAmmountToBank(int amt) {
		Ammount = Ammount + amt;
		System.out.println("Deposit success");
		return Ammount;
	}
	
	public int chechBalance() {
		System.out.println("Your account balance is : "  + Ammount);
		return Ammount;
	}
	
	public void displayAccount() {
		System.out.println("Account number : 123456789123");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Main Balance : " + Ammount);
		
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
//		Random random = new Random();
//		random.setSeed(00);
		
		SavingBankAccount c1 = new SavingBankAccount();
		
		System.out.print("Enter your Age to check to eligibility criteria :- ");
		c1.age=input.nextInt();
		
		if(c1.age >= 18) {
			System.out.println("Welcome, You are eligible to open saving account");
			System.out.println();
			
			System.out.print("Enter your name ");
			c1.name=input.next();
			System.out.print("Enter Ammount, you want to add ");
			c1.Ammount=input.nextInt();
			System.out.println("Your account numner is 123456789123");
			System.out.println("Your total balance : " + c1.Ammount);
			System.out.println();
			System.out.println("********** Congratulations.... , Account crated succesfully ***************");
			
			do {
			System.out.println("Chose any option do you want");
			System.out.println("1. Withdraw Ammount");
			System.out.println("2. Deposit Ammount");
			System.out.println("3. Check balance");
			
			int chose = input.nextInt();
			
			switch(chose) {
			case 1 : { 
				       System.out.println("Enter amount want to withdraw");
			           int withdrawAmt = input.nextInt();
			           c1.Ammount =c1.WithdrawAmmountFromBank(withdrawAmt);
			           
			           break;
		     }
			case 2: { 
				     System.out.println("Enter amount want to deposit");
	                 int depositAmt = input.nextInt();
	                 c1.Ammount= c1.depositAmmountToBank(depositAmt);
	                 break;
	         }
			case 3: {  
				     c1.Ammount=c1.chechBalance();
			         break;
			}
			default : {
				     System.out.println("Invalid choice");
			}
			
			}
			System.out.println("Enter 1 for continue & 0 for exit");
			num=input.nextInt();
			}
			while(num != 0);
			
			System.out.println();
			c1.displayAccount();
			   			
			
		}
		else {
			System.out.println("Oops, Your age is lass then 18");
		}
		
		

	}

}
