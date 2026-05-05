package com.javaprograms;

public class Person {
	    String name;
	    int age;

	    Person(String name, int age)
	    {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Student extends Person
	{
	    int rollNo;
	    String course;

	    Student(String name, int age, int rollNo, String course)
	    {
	        super(name, age);   // calling parent constructor
	        this.rollNo = rollNo;
	        this.course = course;
	    }

	    void display()
	    {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("RollNo: " + rollNo);
	        System.out.println("Course: " + course);
	    }
	

	    public static void main(String[] args)
	    {
	        Student s = new Student("Rahul", 20, 101, "Java");
	        s.display();
	    }
	}
