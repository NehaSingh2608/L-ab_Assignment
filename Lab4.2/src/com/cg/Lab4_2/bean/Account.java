package com.cg.Lab4_2.bean;

import com.cg.Lab4_2.bean.Person;
 class Person
	{
		String name;
		Float age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Float getAge() {
			return age;
		} 
		public void setAge(Float age) {
			this.age = age;
		}
	}

class Account extends Person {
	 private long accNum;
 double balance;
	 private String accHolder;
	 private int minBal=500;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	
	@Override
	public String toString() {
		return "AccountClass [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	 
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	 void deposit(double dep)
	 {
		 balance=balance+dep;
	 }
	 void withdraw(double wid)
	 {
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
