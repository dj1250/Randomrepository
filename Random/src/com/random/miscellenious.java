package com.random;

public class miscellenious {
	int age, RollNo;
  
	public void m1() {
		System.out.println("this is me ");
	}
	public int m2(int a,int b) {
		int c = a*b;
		//System.out.println("result "+ c);
		return c;
	}
	public static void main(String[] args) {
		miscellenious obj = new miscellenious();
		obj.age =30;
		obj.RollNo=15;
		System.out.println("age will be " + obj.age );
		obj.m1();
		int multi=obj.m2(25, 23);
		System.out.println(multi);
		System.out.println("rollno will be "+ obj.RollNo );
	}

}
