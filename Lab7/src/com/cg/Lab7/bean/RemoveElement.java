package com.cg.Lab7.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
      
	
	public void removeDuplicate(ArrayList l1,ArrayList l2)
	{
		l1.removeAll(l2);	
	    System.out.println("First List :"+ l1);
		System.out.println("Second List :"+ l2);
	}

	public static void main(String args[])
	{   	Scanner s=new Scanner(System.in);
		System.out.println("Enter number of element you want to enter");
		int n=s.nextInt();
		System.out.println(n);
		ArrayList<String> l1=new ArrayList<String>();
		ArrayList<String> l2=new ArrayList<String>();
		String s1;
		String s2;
		for(int i=0;i<n;i++) {
			s1=s.nextLine();
			l1.add(s1);
		}
		for(int i=0;i<n;i++) {
			s2=s.nextLine();
			l2.add(s2);
		}
		RemoveElement rl=new RemoveElement();
		rl.removeDuplicate(l1,l2);
		
	}
	
}                                                                                                                      
