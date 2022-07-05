package com.nt.Banking.model;

public class Customers {

	private String firstName;
	private String lastName;
	private String uniqueIDno;
	private String balanceAmount;
	private String accountNo;
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUniqueIDno() {
		return uniqueIDno;
	}
	public void setUniqueIDno(String uniqueIDno) {
		this.uniqueIDno = uniqueIDno;
	}
	public String getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	
}
