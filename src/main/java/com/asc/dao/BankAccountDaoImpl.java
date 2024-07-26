package com.asc.dao;

import java.util.List;

import com.asc.Util.EntityUtil;
import com.asc.bank.BankAccount;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class BankAccountDaoImpl implements BankAccountDao{

	@Override
	public void addAccount(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(bankAccount);
		et.commit();
	}

	@Override
	public void updateAccount(int id,double balance) {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		BankAccount b = em.find(BankAccount.class, id);
		b.setAccountBalance(balance);
		et.commit();
		
	}

	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		BankAccount b = em.find(BankAccount.class, id);
		em.remove(b);
		et.commit();
	}

	@Override
	public void DisplayAll() {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query q= em.createQuery("SELECT b FROM BankAccount As b");
		List<BankAccount> plist= q.getResultList();
		for(BankAccount b:plist) {
			System.out.println(b);
		}
	}

	@Override
	public BankAccount FindById(int id) {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		BankAccount b = em.find(BankAccount.class, id);
		if(b==null) System.out.println("No Account Available with this "+id);
		return b;
	}

	@Override
	public BankAccount FindByName(String name) {
		EntityManager em = EntityUtil.getEntityManager();
		Query q = em.createQuery("SELECT b FROM BankAccount b WHERE b.customerName = :name");
	    q.setParameter("name", name);
	    return (BankAccount) q.getSingleResult();
	}

	@Override
	public void FindByBranchCode(int branchCode) {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		Query q = em.createQuery("SELECT b FROM BankAccount b WHERE b.branchCode =:branchCode");
	    q.setParameter("branchCode", branchCode);
	    List<BankAccount> Glist = q.getResultList();
	    if(Glist.isEmpty()) {
	        System.out.println("No Accounts Available  with branchCode " + branchCode);
	    } else {
	        for(BankAccount b : Glist) {
	            System.out.println(b);
	        }
	    }
	}

	@Override
	public void DisplayGroupBy() {
		// TODO Auto-generated method stub
		EntityManager em = EntityUtil.getEntityManager();
		Query q = em.createQuery("SELECT b.ActNumber, b.customerName, b.city FROM BankAccount b GROUP BY b.ActNumber,b.city,b.customerName");
		List<Object []> Glist = q.getResultList();
		for(Object[] ob:Glist) {
			System.out.println(ob[0]+"-"+ob[1]+"-"+ob[2]);
		}
	}
	

}
