package com.cg.Lab3.bean;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Localdate {
	public static void main(String args[]) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter date in dd/MM/yyyy format:");
	String input1  = scanner.nextLine();
	LocalDate enteredDate1 = LocalDate.parse(input1,formatter);
	String input2  = scanner.nextLine();
	LocalDate enteredDate2 = LocalDate.parse(input2,formatter);
	Period diff=Period.between(enteredDate1, enteredDate2);
    System.out.printf("The Difference is %d years, %d months,%d days ",diff.getYears(),diff.getMonths(),diff.getDays());     
}
}