package com.cg.Lab2.bean;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		num=Integer.parseInt(args[0]);
		if(num >= 0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		
	}

}
