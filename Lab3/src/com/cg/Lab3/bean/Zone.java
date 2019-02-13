package com.cg.Lab3.bean;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
public class Zone {
	  public static void main(String args[]){
	        String str1;
	        String str2;
	        Instant timeStamp= Instant.now();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the zone id");
	        str1=sc.nextLine();
	        str2=sc.nextLine();
	        String zoneId2=str1+"/"+str2;
	        System.out.println(zoneId2);
	        ZonedDateTime LAZone=timeStamp.atZone(ZoneId.of(zoneId2));
	        System.out.println(LAZone);
}
}
