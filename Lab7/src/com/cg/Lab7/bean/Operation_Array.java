package com.cg.Lab7.bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Operation_Array {
		
	public void  getSorted(int[] arr ) {
		String strarr[]= new String[arr.length];
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			strarr[i]=String.valueOf(arr[i]);
			sb1.append(strarr[i]);
			strarr[i]=sb1.reverse().toString();
			sb1.delete(0, arr.length);
		}
		Arrays.sort(strarr);
		for(int i=0;i<strarr.length;i++)
			System.out.print(strarr[i]+" ");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of element");
		n=s.nextInt();
	int  arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		Operation_Array o=new Operation_Array();
		o.getSorted(arr);
		
	}

}
