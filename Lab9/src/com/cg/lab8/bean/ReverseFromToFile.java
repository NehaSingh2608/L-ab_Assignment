package com.cg.lab8.bean;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFromToFile
{
    public static void main(String[] args) throws IOException
       {
          try{
          String source = "input.txt";
          String target = "output.txt";

          File sourceFile=new File(source);

          Scanner content=new Scanner(sourceFile);
          PrintWriter pwriter =new PrintWriter(target);

          while(content.hasNextLine())
          {
             String s=content.nextLine();
             StringBuffer buffer = new StringBuffer(s);
             buffer=buffer.reverse();
             String rs=buffer.toString();
             pwriter.println(rs);
          }
          content.close();    
          pwriter.close();
          System.out.println("File is copied successful!");
          }

          catch(Exception e){
              System.out.println("Something went wrong");
          }
       }
}