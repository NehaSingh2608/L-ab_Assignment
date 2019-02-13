package com.cg.Lab2.bean;
class Person{
	String F;
	String L;
	String G;
	public Person() {
		super();
	}
	public Person(String f, String l, String g) {
		super();
		F = f;
		L = l;
		G = g;
	}
	
	void display() {
		System.out.println("Firstname:"+F);
		System.out.println("Lastname:"+L);
		System.out.println("Gender:"+G);
	}
}

public class PersonMain {
	public static void main(String args[]) {
		Person p=new Person("Neha","Singh","Female");
		p.display();
	}

}
