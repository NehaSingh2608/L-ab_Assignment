package com.cg.eis.exception;

import java.lang.Exception;
import java.util.Scanner;

class Employee_Exception extends Exception{
	 private int salary;
	    Employee_Exception(int a) {
	        salary = a;
	     }
	    Employee_Exception(String msg)
	    {
	    	super(msg);
	    }
	    public String toString()      {
	        return "Employee_Exception["+salary+"]";
	     }
	}
 class EmployeeException
 {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
	        try {
	        	System.out.println("Enter salary of an emplyoee");
	        	int a;
	        	Scanner s=new Scanner(System.in);
	        	a=s.nextInt();
	        	if(a<3000)
	        	{
	        		throw new Employee_Exception("Below 3000 salary is not possible");
	        	}
	        }
	        catch(Employee_Exception ne) {
	        	System.out.println(ne.getMessage());
	        }
	        System.out.println("Exception Completed");
		}

 }

