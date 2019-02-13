package com.cg.lab8.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayEvenNum {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner=new Scanner(new File("Number.txt"));
		scanner.useDelimiter(",");
		while(scanner.hasNext())
		{
			int val=scanner.nextInt();
			if(val%2==0)
				System.out.println(val);
		}

	}

}
