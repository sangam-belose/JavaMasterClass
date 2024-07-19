package com.practice.designpattern.structural;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterPatternExample {
	public static void main(String[] args) {
		CreditCard card = new BankCustomer();
		card.giveBankDetails();
		System.out.println(card.getCreditCard());
	}
}

// Target interface
interface CreditCard {
	void giveBankDetails();

	String getCreditCard();
}

// adaptee class
class BankDetails {
	private String bankName;
	private String accHolderName;
	private long accountNumber;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
}

//Adapter class
class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter account holder name: ");
			String accountHolderName = reader.readLine();
			System.out.print("Enter Account no: ");
			long accountNumber = Long.parseLong(reader.readLine());
			System.out.print("Enter Bank Name: ");
			String bankName = reader.readLine();

			// setting the values
			setAccHolderName(accountHolderName);
			setAccountNumber(accountNumber);
			setBankName(bankName);
		} catch (IOException e) {
			System.err.println("Error reading input");
		} catch (NumberFormatException e) {
			System.err.println("Invalid Number entered");
		}
	}

	@Override
	public String getCreditCard() {
		return String.format(
			"The Account number %d of %s in %s bank is valid and authenticated for issuing the credit card.",
			getAccountNumber(),
			getAccHolderName(),
			getBankName()
		);
	}
}

