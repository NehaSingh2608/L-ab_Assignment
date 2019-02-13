package com.cg.Lab6.bean;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeException extends Exception{
	AgeException(String msg){
    super(msg);
}
}
 class Age{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	System.out.println("Enter Age user");
        	int a;
        	Scanner s=new Scanner(System.in);
        	a=s.nextInt();
        	if(a<15)
        	{
        		throw new AgeException("Below 15 year age is not possible");
        	}
            }
        catch(AgeException ne) {
        	System.out.println(ne.getMessage());
        }
        System.out.println("Exception Completed");
	}

}