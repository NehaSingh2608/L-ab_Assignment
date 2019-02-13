package com.cg.Lab3.bean;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DifferenceDate {
	public static void main(String args[])
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		LocalDate enteredDate = LocalDate.parse(input,formatter);
         LocalDate today=LocalDate.now();
         Period diff=Period.between(enteredDate, today);
    System.out.printf("The Difference is %d years, %d months,%d days ",diff.getYears(),diff.getMonths(),diff.getDays());     
	}

}
