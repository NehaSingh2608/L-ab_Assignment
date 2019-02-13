package com.cg.Lab3.bean;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WarrentyPeriod {
public static void main(String args[]) {
	LocalDate result=null;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter purchase date in dd/MM/yyyy format:");
	String purchasedate  = scanner.nextLine();
	System.out.print("Enter Warrenty date in MM/yyyy format:");
	int  months=scanner.nextInt();
	int years=scanner.nextInt();
	LocalDate enterDate1 = LocalDate.parse(purchasedate,formatter);
	if(months>0 && months<13)
	{
		result=enterDate1.plusMonths(months);
	}
	else
		System.out.println("Invalid");
		if(years>0) {
			System.out.println("your warrenty expires on="+result.plusYears(years));
		}
		else
			System.out.println("Invalid");
}
}
