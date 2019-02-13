package com.cg.Lab4_2.bean;

public class CurrentAcc extends Account{
final double overdraft=100.0;
void withdraw(double b) {
	if(balance-b<overdraft)
		System.out.println("True");
	else
		System.out.println("False");
}
}
