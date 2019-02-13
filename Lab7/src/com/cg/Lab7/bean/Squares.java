package com.cg.Lab7.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Squares {
	
	public void getSquares(int n)
	{
		Scanner sc= new Scanner(System.in);
		HashMap<Integer,Double> map= new HashMap();
		for(int i=0;i<n;i++)
		{
			int p= sc.nextInt();
			map.put((Integer)p,Math.pow(p, 2));
		}		
		for (Map.Entry<Integer,Double> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
      System.out.println("Enter no of element in array");
      int n=s.nextInt();
 
      for(int i=0;i<n;i++)
      {
    	  Squares sq= new Squares();
    	  sq.getSquares(n);
      }
	}

}
