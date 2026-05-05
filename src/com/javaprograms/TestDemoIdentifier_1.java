package com.javaprograms;

public class TestDemoIdentifier_1 {
	static String $college_name = "vcube";
	static int college_id = 111;
	int student_id;
	int student_name;

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemoIdentifier_1 s1 = new TestDemoIdentifier_1();
		System.out.println(s1.student_id);
		System.out.println(s1.student_name);
		System.out.println($college_name);
		System.out.println(s1.college_id);
		s1.show();


	}

	 void show() {
    System.out.println("show method called");		
	}

}
