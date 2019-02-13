package com.cg.Lab4_2.bean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Account a1=new Account();
     Account a2=new Account();
     a1.setAccHolder("Smith");
     a1.setAge(25.0f);
     a1.setBalance(2000);
     a1.deposit(2000);
     a2.setAccHolder("Kathy");
     a2.setAge(26.0f);
     a2.setBalance(3000);
     a2.withdraw(2000);
     System.out.println("Updated salary of smith is\t "+a1.getBalance());
     System.out.println("Account Holder is\t" +a1.getAccHolder());
     System.out.println("----------------------------------------------");
     System.out.println("Updated salary of Kathy is\t "+a2.getBalance());
     System.out.println("Account Holder is\t" +a2.getAccHolder());
     System.out.println(a1);
     System.out.println(a2);
     SavingAcc s=new SavingAcc();
     CurrentAcc c=new CurrentAcc();
     s.withdraw(450);
     c.withdraw(600);
	}

}
