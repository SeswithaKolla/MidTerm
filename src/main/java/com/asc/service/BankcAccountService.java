package com.asc.service;

import com.asc.bank.BankAccount;

public interface BankcAccountService {
	public void addAccount(BankAccount bankAccount);
	public void updateAccount(int id,double balance);
	public void deleteAccount(int id);
	public void DisplayAll();
	public BankAccount FindByAccNum(int AccNum);
	public BankAccount FindByName(String name);
	public void FindByBranchCode(int branchCode);
	public void DisplayGroup();
}
