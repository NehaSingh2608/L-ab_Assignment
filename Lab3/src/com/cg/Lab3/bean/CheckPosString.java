package com.cg.Lab3.bean;
import java.util.*;
public class CheckPosString{
	public static void main(String[] args) {
		int n=0;
		int i;
		String str=new String();
		System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
         str=sc.next();
      for(i=0;i<str.length();i++)
      {
    	  if(str.charAt(i)<str.charAt(i+1))
    	  {
    		  n=0;
    	  }
    	  else 
    	  {
    		  n=1;
    		  break;
    	  }
    		 
      }
      if(n==1) 
      {
    	  System.out.println("False");
      }
      else 
      {
    	  System.out.println("True");
      }
      
	}

}
