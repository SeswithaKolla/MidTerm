package com.asc.service;

import com.asc.bank.BankAccount;
import com.asc.dao.BankAccountDao;
import com.asc.dao.BankAccountDaoImpl;

public class BankAccServiceImpl implements BankcAccountService {

	@Override
	public void addAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		bankAccountdao.addAccount(bankAccount);
	}

	@Override
	public void updateAccount(int id, double balance) {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		bankAccountdao.updateAccount(id, balance);
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		bankAccountdao.deleteAccount(id);
	}

	@Override
	public void DisplayAll() {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		bankAccountdao.DisplayAll();
	}

	@Override
	public BankAccount FindByAccNum(int AccNum) {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		return bankAccountdao.FindByAccNum(AccNum);
	}

	@Override
	public BankAccount FindByName(String name) {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		return bankAccountdao.FindByName(name);
	}

	@Override
	public void FindByBranchCode(int branchCode) {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		bankAccountdao.FindByBranchCode(branchCode);
	}

	@Override
	public void DisplayGroup() {
		// TODO Auto-generated method stub
		BankAccountDao bankAccountdao = new BankAccountDaoImpl();
		bankAccountdao.DisplayGroupBy();
	}
	

	

}
