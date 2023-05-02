package Course3Sprint3;


public class SavingAccountImpl {

	public static void main(String[] args) {
		
		SavingAccount c1 = new SavingAccount();
		
		c1.setAccountHolderName("Keshav");
		c1.setAge(23);
		c1.setAccountNumber(12345678910l);
		c1.setAccountOpeningDate("28/03/2023");
		c1.setAccountStatus("Active");
		c1.setTotalAccountBalance(3000);
		c1.setInternetBanking(true);
		c1.setMobileBanking(true);
		c1.setIntrestRate(12);
		c1.setModeOfOperation("self");
		
	    System.out.println("Name : " + c1.getAccountHolderName());
	    System.out.println("Age : " + c1.getAge());
	    System.out.println("Account number : " + c1.getAccountNumber());
	    System.out.println("Account opning date : " + c1.getAccountOpeningDate());
	    System.out.println("Account status : " + c1.getAccountStatus());
	    System.out.println("Total account ballance : " + c1.getTotalAccountBalance());
	    System.out.println("Internet banking : " + c1.isInternetBanking());
	    System.out.println("Mobile banking : " + c1.isMobileBanking());
	    System.out.println("Intrest rate : " + c1.getIntrestRate());
	    System.out.println("Mode of operation : " + c1.getModeOfOperation());
	    System.out.println("-------------------------------------------------------------------");
	    System.out.println("-------------------------------------------------------------------");
	    
	    c1.craditAmount(4000);
	    c1.debitAmount(2000);
	    System.out.println("Available Ballance : " + c1.retrieveBalance());


	}

}
