package com.example.bank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class AccountDetails {
    @Id
    @Digits(message="AccountID should contain 10 digits.", fraction = 0, integer = 10)
	private String accountID;
	private String customerName;
	private int pan;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    @Past(message = "Enter valid date.")
	private Date DateOfBirth;
	private String accountType;
	private String accountState;
    @NotNull
    @Positive
	private long accountBalance;
    @Digits(message="Mobile number should contain 10 digits.", fraction = 0, integer = 10)
	private String mobileNumber;
	@NotBlank
	@Email(message="Email should be valid")
	private String email;
	@Min(value = 1000, message = "Monthly average balance must be greater than 1000")
	private long monthlyAverageBalance;
	public String getAccountID() {
		return accountID;
	}
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
