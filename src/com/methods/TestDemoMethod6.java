package com.methods;

import java.util.Scanner;

//WITH ARGUMENT AND NO RETURN TYPE
public class TestDemoMethod6 {

	public static void main(String[] args) {
         System.out.println("main method started");
         Scanner sc = new Scanner(System.in);
         System.out.println("enter your age :");
         int age = sc.nextInt();
         System.out.println("enter your first name :");
         String fname = sc.next();
         System.out.println("enter your last name :");
         String lname = sc.next();
         TestDemoMethod6 t = new TestDemoMethod6();
         t.getemployeeAge (age);
         t.getemployeefullname (fname,lname);
         sc.close();
	}
	void getemployeeAge(int age) {
		System.out.println("employee age is" +age);
	}
	void getemployeefullname(String fname,String lname) {
		System.out.println("employee fullname is " +fname+lname);
	}

}
