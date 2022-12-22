package properties;

public class account {

	private int accountNumber;
	private String userName;
	private double initialValue;
	
	public account (int accountNumber, String userName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.userName = userName;
		addDeposit(initialDeposit);
	}
	
	public account (int accountNumber, String userName) {
		this.accountNumber = accountNumber;
		this.userName = userName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public double getInitialValue() {
		return initialValue;
	}
	
	public double addDeposit(double value) {
		this.initialValue = value+initialValue;
		return initialValue;
	}
	
	public double withdraw(double value) {
		this.initialValue = initialValue - value - 5.00;
		return initialValue;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder "
				+ userName
				+ ", Balance: "
				+ String.format("%.2f", initialValue);
	}
}
