package com.asc.bank;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
@Id
private int ActNumber;
private String customerName;
private double accountBalance;
private String city;
@Override
public String toString() {
	return "BankAccount [ActNumber=" + ActNumber + ", customerName=" + customerName + ", accountBalance="
			+ accountBalance + ", city=" + city + ", branchCode=" + branchCode + "]";
}
private int branchCode;
public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
}
public BankAccount(int actNumber, String customerName, double accountBalance, String city, int branchCode) {
	super();
	ActNumber = actNumber;
	this.customerName = customerName;
	this.accountBalance = accountBalance;
	this.city = city;
	this.branchCode = branchCode;
}
public int getActNumber() {
	return ActNumber;
}
public void setActNumber(int actNumber) {
	ActNumber = actNumber;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getBranchCode() {
	return branchCode;
}
public void setBranchCode(int branchCode) {
	this.branchCode = branchCode;
}

}
