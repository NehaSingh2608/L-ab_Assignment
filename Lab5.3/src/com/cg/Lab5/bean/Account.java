package com.cg.Lab5.bean;

public abstract class Account {
	private long accNum;
	 double balance;
	 private String accHolder;
	 private int minBal=500;
	 
	abstract void withdraw(double wid);
	abstract void deposit(double dep);
	 
}
 
class Person extends Account{
    
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	void deposit(double dep) {
		// TODO Auto-generated method stub
		 balance=balance+dep;
	}
	@Override
	void withdraw(double wid) {
		// TODO Auto-generated method stub
		if(balance-wid>=500)
			 balance=balance-wid;
		 else
			 System.out.println("Abort transcation");
	}
	void getbalance()
	 {
		 System.out.println(balance);
	 }

	
}
