package com.javaprograms;
//1) Create a class named Student with the following data members:

//name, marks1, marks2, marks3, total, average

//Requirements:
//(The constructor should accept name, marks1, marks2, and marks3 as parameters.
//Inside the constructor:
//Calculate the total marks.
//Calculate the average marks.
//Create a method to display all student details.)
public class StudentMarks {
	String name;
	int marks1;
	int marks2;
	int marks3;
	int total;
	double average;

	StudentMarks(String name, int marks1, int marks2, int marks3) {
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.total = this.marks1 + this.marks2 + this.marks3;

		this.average = this.total / 3;
	}

	public static void main(String[] args) {
		System.out.println("***STUDENT MARKS***");
		StudentMarks S1 = new StudentMarks("joshna", 85, 97, 89);
		S1.display();
	}

	void display() {
		System.out.println("student name = " + name);
		System.out.println("student marks1= " + marks1);
		System.out.println("student marks2 = " + marks2);
		System.out.println("student marks3 = " + marks3);
		System.out.println("student total = " + total);
		System.out.println("student average = " + average);
	}

}