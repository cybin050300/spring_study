package com.cyb.spring.account;

public class AccountVO {
	private String accountNo;
	private String custName;
	private int balance;

	
	public AccountVO() {
	}
	
	public AccountVO(String accountNo,	String custName, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.custName = custName;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


}
