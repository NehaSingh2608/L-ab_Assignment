package com.cg.Lab4_2.bean;

public class SavingAcc extends Account{
final int minbalance=500;
public void withdraw(double w) {
	if(super.balance-w>=minbalance)
		balance=balance-w;
	else
		System.out.println("Transaction Abort");
}
}
