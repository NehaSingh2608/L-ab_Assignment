package com.cg.Lab3.bean;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		System.out.println("Enter array of string seprated by space");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		String[] sArray=s.split(" ");
		int l=sArray.length;
		Arrays.sort(sArray);
		for (int i=0;i<l;i++)
		{
			if(i<l/2 ||(l%2 !=0 && i<=l/2))
				System.out.println(sArray[i].toUpperCase());
			else
				System.out.println(sArray[i].toLowerCase());
		}
	}

}
