package com.cg.Lab3.bean;
import java.util.*;
public class JobSeeker {
	public static void main(String args[])
{
		System.out.println("Enter the username");
		 String str;
		 Scanner s=new Scanner(System.in);
		 str=s.next();
		 int len=str.length();
		 System.out.println(len);
		 String ss=str.substring(len-4, len);
		 System.out.println(ss);
		 if(len>=12)
		 {
			 if(ss.compareTo("_job")==0)
			 {
				 System.out.println("valid username");
			 }
			 else
			 {
				 System.out.println("False");
			 }
			 }
		 else
		 {
			 System.out.println("Enter username is not valid");
		 }
		}
}
