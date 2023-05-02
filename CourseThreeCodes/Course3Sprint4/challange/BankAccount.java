package Course3Sprint4.challange;

public abstract class BankAccount {
	
	private long accountNumber;
	private String name;
	private int age;
	private String accountStatus;
	private int totalAccountBalance;
	
	
	public BankAccount(long accountNumber, String name, int age, String accountStatus, int totalAccountBalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.age = age;
		this.accountStatus = accountStatus;
		this.totalAccountBalance = totalAccountBalance;
	}
	
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public int getTotalAccountBalance() {
		return totalAccountBalance;
	}
	public void setTotalAccountBalance(int totalAccountBalance) {
		this.totalAccountBalance = totalAccountBalance;
	}
	
	
	public abstract int retrieveBalane();
	public abstract int debitCash(int withdrawAmount);
	public abstract int craditCash(int depositAmount);

}
