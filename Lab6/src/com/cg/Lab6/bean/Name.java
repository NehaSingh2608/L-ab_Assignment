package com.cg.Lab6.bean;

import java.util.Scanner;

@SuppressWarnings("serial")
class NameException extends Exception{
	NameException(String msg){
    super(msg);
}
}
 class Name{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	System.out.println("ENTER first and last name of user");
        	String fname;
        	String lname;
        	Scanner s=new Scanner(System.in);
        	fname=s.nextLine();
        	lname=s.nextLine();
        	if((fname.equals("") && (lname.equals(""))))
        	{
        		throw new NameException("Blank is not possible");
        	}
        }
        catch(NameException ne) {
        	System.out.println(ne.getMessage());
        }
        System.out.println("Exception Completed");
	}

}
