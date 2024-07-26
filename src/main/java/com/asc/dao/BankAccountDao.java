package com.asc.dao;

import com.asc.bank.BankAccount;

public interface BankAccountDao {
	public void addAccount(BankAccount bankAccount);
	public void updateAccount(int id,double balace);
	public void deleteAccount(int id);
	public void DisplayAll();
	public BankAccount FindByAccNum(int AccNum);
	public BankAccount FindByName(String name);
	public void FindByBranchCode(int branchCode);
	public void DisplayGroupBy();
}
