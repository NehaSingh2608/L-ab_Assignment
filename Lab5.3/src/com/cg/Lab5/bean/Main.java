package com.cg.Lab5.bean;

public class Main {
	public static void main(String args[]){
		Person p=new Person();
		p.deposit(4000);
		p.withdraw(2000);
		System.out.println("balance is:" +p.getBalance());
		
	}
}
