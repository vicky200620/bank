package com.example.bank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AccountDetails {
   @Id
	private String accountID;
	private String customerName;
	private int pan;
	private Date DateOfBirth;
	private String accountType;
	private String accountState;
	private long accountBalance;
	private String mobileNumber;
	private String email;
	private long monthlyAverageBalance;
	
	public AccountDetails(String accountID, String customerName, int pan, Date dateOfBirth, String accountType,
			String accountState, long accountBalance, String mobileNumber, String email, long monthlyAverageBalance) {
		super();
		this.accountID = accountID;
		this.customerName = customerName;
		this.pan = pan;
		DateOfBirth = dateOfBirth;
		this.accountType = accountType;
		this.accountState = accountState;
		this.accountBalance = accountBalance;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.monthlyAverageBalance = monthlyAverageBalance;
	}
	
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getPan() {
		return pan;
	}
	public void setPan(int pan) {
		this.pan = pan;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountState() {
		return accountState;
	}
	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMonthlyAverageBalance() {
		return monthlyAverageBalance;
	}
	public void setMonthlyAverageBalance(long monthlyAverageBalance) {
		this.monthlyAverageBalance = monthlyAverageBalance;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountID=" + accountID + ", customerName=" + customerName + ", pan=" + pan
				+ ", DateOfBirth=" + DateOfBirth + ", accountType=" + accountType + ", accountState=" + accountState
				+ ", accountBalance=" + accountBalance + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", monthlyAverageBalance=" + monthlyAverageBalance + "]";
	}
	
	
	
	
	
}
