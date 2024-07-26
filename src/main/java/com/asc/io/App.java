package com.asc.io;

import java.util.Scanner;

import com.asc.bank.BankAccount;
import com.asc.dao.BankAccountDao;
import com.asc.service.BankAccServiceImpl;
import com.asc.service.BankcAccountService;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("1.Add Account");
		System.out.println("2.Update Account");
		System.out.println("3.Delete Account");
		System.out.println("4.Display All Accounts");
		System.out.println("5.Finding By Account Number");
		System.out.println("6.Finding By Name");
		System.out.println("7.Finding By BranchCode");
		System.out.println("8.Display Using Group By");
		System.out.println("Enter Your Choice:");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			addAccount();
			break;
		case 2:
			UpdateAccount();
			break;
		case 3:
			DeleteAccount();
			break;
		case 4:
			DisplayAll();
			break;
		case 5:
			FindByAccNum();
			break;
		case 6:
			FindByName();
			break;
		case 7:
			FindByBranchCode();
			break;
		case 8:
			DisplayGroupBy();
			break;
		default:
			System.out.println("Invalid Choice...!");
			break;
		}
		
    }
    public static void addAccount() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Account Id:");
    	int acctno= sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter the Name:");
    	String name = sc.nextLine();
    	System.out.println("Enter the Balance:");
    	double balance = sc.nextDouble();
    	sc.nextLine();
    	System.out.println("Enter the City:");
    	String city = sc.nextLine();
    	System.out.println("Enter the Branch Code:");
    	int branchCode=sc.nextInt();
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	BankAccount Ba = new BankAccount();
    	Ba.setActNumber(acctno);
    	Ba.setCustomerName(name);
    	Ba.setAccountBalance(balance);
    	Ba.setCity(city);
    	Ba.setBranchCode(branchCode);
    	BAservice.addAccount(Ba);
    	System.out.println("Records Added Succesfully...!");
    }
    public static void UpdateAccount() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Account Id:");
    	int acctno= sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter the Balance:");
    	double balance = sc.nextDouble();
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	BAservice.updateAccount(acctno, balance);
    	System.out.println("Updated Sucessfully...!");
    }
    public static void DeleteAccount() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Account Id:");
    	int acctno= sc.nextInt();
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	BAservice.deleteAccount(acctno);
    	System.out.println("Deleted Sucessfully...!");
    }
    public static void DisplayAll() {
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	BAservice.DisplayAll();
    }
    public static void FindByAccNum() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Account Id:");
    	int acctno= sc.nextInt();
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	System.out.println(BAservice.FindByAccNum(acctno));
    }
    public static void FindByName() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Name:");
    	String acctno= sc.nextLine();
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	System.out.println(BAservice.FindByName(acctno));
    }
    public static void FindByBranchCode() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the BranchCode:");
    	int branchCode=sc.nextInt();
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	BAservice.FindByBranchCode(branchCode);
    }
    public static void DisplayGroupBy() {
    	BankcAccountService BAservice = new BankAccServiceImpl();
    	BAservice.DisplayGroup();
    }
}
