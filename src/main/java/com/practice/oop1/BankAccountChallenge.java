package com.practice.oop1;

public class BankAccountChallenge {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountBalance(1000);
		bankAccount.setAccountNumber(1234);
		bankAccount.setCustomerName("Dan");
		bankAccount.setEmail("Dan@gmail.com");

		bankAccount.deposit(2000);
		bankAccount.withdraw(500);

		System.out.println("remaining balance: "+bankAccount.getAccountBalance());
	}

}

class BankAccount {
	private long accountNumber;
	private double accountBalance;
	private String customerName;
	private String email;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void deposit(double money) {
		this.accountBalance += money;
		System.out.println("deposited " + money);
	}

	public void withdraw(double money) {
		if (money > this.accountBalance) {
			throw new UnsupportedOperationException("Insufficient balance");
		}
		this.accountBalance -= money;
		System.out.println("withdrawn " + money);
	}
}
