package com.cg.Lab3.bean;
import java.util.*;
import java.lang.String;

public class DifferentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		String result=new String();
		System.out.println("Enter user choice:"+"1.concat itself:"+"2.replace odd with #:"+
		"3.remove duplicate:"+"4.change odd char");
		choice=s.nextInt();
		switch(choice)
		
		{
		case 1:
			result=s1.concat(s1);		    
			System.out.println("operation 1 result is"+result);
			break;
		case 2:
			int l=s1.length();
			for(int i=0;i<l;i++) {
				if(i%2!=0)
				 s1= s1.substring(0,i-1) + "#" + s1.substring(i, s1.length());
				}
				System.out.println("operation 2 result is"+s1);
				break;
		case 3:
			 String res = "";
			    for (int i = 0; i < s1.length(); i++) {
			        if(!res.contains(String.valueOf(s1.charAt(i)))) {
			            res+= String.valueOf(s1.charAt(i));
			        }
			    }
			    System.out.println(res);
	        break;
		case 4:
			for (int i = 0, len = s1.length(); i < len; i++) {
			    char ch = s1.charAt(i);
			    if (i % 2 == 0) {
			        System.out.print(ch);
			    } else {
			        System.out.print(Character.toUpperCase(ch));
			    }
			}
				break;
			}	
		}
}
