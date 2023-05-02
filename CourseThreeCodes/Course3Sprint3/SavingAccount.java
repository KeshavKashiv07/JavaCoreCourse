package Course3Sprint3;

public class SavingAccount {
	
	private String accountHolderName;
	private int age;
	private long accountNumber;
	private String accountOpeningDate;
	private String accountStatus;
	private int availableBlance;
	private int totalAccountBalance;
	private boolean internetBanking;
	private boolean mobileBanking;
	private int intrestRate;
	private String modeOfOperation;
	
	
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(String accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public int getAvailableBlance() {
		return availableBlance;
	}
	public void setAvailableBlance(int availableBlance) {
		this.availableBlance = availableBlance;
	}
	public int getTotalAccountBalance() {
		return totalAccountBalance;
	}
	public void setTotalAccountBalance(int totalAccountBalance) {
		this.totalAccountBalance = totalAccountBalance;
	}
	public boolean isInternetBanking() {
		return internetBanking;
	}
	public void setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
	}
	public boolean isMobileBanking() {
		return mobileBanking;
	}
	public void setMobileBanking(boolean mobileBanking) {
		this.mobileBanking = mobileBanking;
	}
	public int getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(int intrestRate) {
		this.intrestRate = intrestRate;
	}
	public String getModeOfOperation() {
		return modeOfOperation;
	}
	public void setModeOfOperation(String modeOfOperation) {
		this.modeOfOperation = modeOfOperation;
	}
	
	
	
	public float debitAmount(int withdrawAmount) {
		totalAccountBalance = getTotalAccountBalance() - withdrawAmount;
		System.out.println("debited successfully with rupees " + withdrawAmount);
		return totalAccountBalance;
	}
	
	public float craditAmount(int depositAmount) {
		totalAccountBalance = getTotalAccountBalance() + depositAmount;
		System.out.println("cradit successfully with rupees " + depositAmount);
		return totalAccountBalance;
	}
	
	public float retrieveBalance() {
		availableBlance = getTotalAccountBalance();		
		return availableBlance;
	}
		

}
