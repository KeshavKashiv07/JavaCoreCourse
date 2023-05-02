package Course3Sprint4.challange;

public class BankAccountImpl {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(12345678910l, "Keshav", 23, "Active", 5000, "Saving");
		sa.displayDetails();
		sa.craditCash(4000);
		sa.debitCash(7000);
		System.out.println("Account balance is "  + sa.retrieveBalane());
		
		System.out.println();
		System.out.println();
		
		CurrentAccount ca = new CurrentAccount(9876543210l, "Ram", 30, "Active", 1000, "Current Account");
		ca.displayDetails();
		ca.craditCash(5000);
		ca.debitCash(3000);
		System.out.println("Account balance is "  + ca.retrieveBalane());
		

	}

}
