package com.cg.Lab4.bean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AccountClass ac1=new AccountClass();
      AccountClass ac2=new AccountClass();
      ac1.setName("Smith");
      ac1.setAge(25.12f);
      ac1.getName();
      ac1.getAge();
      ac2.setName("Kathi");
      ac2.setAge(26.2f);
      ac2.getName();
      ac2.getAge();
      ac1.setBalance(2000);
      ac2.setBalance(3000);
      ac1.getBalance();
      ac2.getBalance();
      ac1.deposit(2000.0);
      ac2.withdraw(3000.0);
       ac1.getBalance();
       ac2.getbalance();
       System.out.println(ac1);
	}

}
