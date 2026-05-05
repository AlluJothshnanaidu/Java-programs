package com.javaprograms;

public class StudentInfo {
    String studentname;
	int studentid;
	int studentage;

	public static void main(String[] args) {
		System.out.println("****StudentInfo****");
		StudentInfo s1 = new StudentInfo();
		s1.studentname = "joshna";
		s1.studentid = 43665;
		s1.studentage = 21;

		System.out.println("studentname = " + s1.studentname);
		System.out.println("studentid = " + s1.studentid);
		System.out.println("studentage= " + s1.studentage);

	}

}