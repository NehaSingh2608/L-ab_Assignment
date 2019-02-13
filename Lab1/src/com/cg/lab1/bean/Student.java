package com.cg.lab1.bean;

public class Student {
 private int studRollNo;
 private String studName;
 private float studMarks;
 private static String studSchoolName;
 
 //static block
 static {
	 studSchoolName="St Xavier";
 }
public Student(int studRollNo, String studName, float studMarks) {
	super();
	this.studRollNo = studRollNo;
	this.studName = studName;
	this.studMarks = studMarks;
	this.studSchoolName= studSchoolName;
}

public Student() {
	super();
}

public int getStudRollNo() {
	return studRollNo;
}
public void setStudRollNo(int studRollNo) {
	this.studRollNo = studRollNo;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public float getStudMarks() {
	return studMarks;
}
public void setStudMarks(float studMarks) {
	this.studMarks = studMarks;
}
public String getStudSchoolName() {
	return studSchoolName;
}

public void setStudSchoolName(String studSchoolName) {
	this.studSchoolName = studSchoolName;
}

@Override
public String toString() {
	return "Student [studRollNo=" + studRollNo + ", studName=" + studName + ", studMarks=" + studMarks + ",studSchoolName="+studSchoolName+"]";
}
 
}
