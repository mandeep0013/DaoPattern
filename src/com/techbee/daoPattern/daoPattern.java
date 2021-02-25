package com.techbee.daoPattern;

public class daoPattern {
	private int accno;
    private String name;
    private long balance;
    private String email;
    private long phoneNo;
    
    daoPattern(int accno, String name, long balance, String email, long phoneNo){
    	this.accno = accno;
    	this.name = name;
    	this.balance = balance;
    	this.email = email;
    	this.phoneNo = phoneNo;
    }
    
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}



