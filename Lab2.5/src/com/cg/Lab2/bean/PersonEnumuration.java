package com.cg.Lab2.bean;
enum Gender{
	M,F;
}

class Person{
	String F;
	String L;
	Gender G;
	int N;
	public Person() {
		super();
	}
	public Person(String f, String l, Gender g) {
		super();
		F = f;
		L = l;
		G = g;
	}
	public void getphoneNumber(int n) {
		N= n;		
	}

	void display() {
		System.out.println("Firstname:"+F);
		System.out.println("Lastname:"+L);
		System.out.println("Gender:"+G);
		System.out.println("Phone number is:"+N);
	}
}

public class PersonEnumuration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
				Person p=new Person("Neha","Singh",Gender.M);
				p.getphoneNumber(98970260);
				p.display();
			}
	}


}
