package com.cg.Lab7.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Strore {
	
	public ArrayList getSorted(ArrayList list)
	{
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	      int i;
      Scanner sc=new Scanner(System.in);
      ArrayList <String >list=new ArrayList();
      System.out.println("Enter number of Products");
      int n=sc.nextInt();
      for( i=0;i<n;i++) 
      {
    	String str=sc.next();
    	list.add(str); 
    	}     
      Strore s=new Strore();;
      s.getSorted(list);
   for (String j:list) 
   {
	   System.out.println(j);
   }
}
}

