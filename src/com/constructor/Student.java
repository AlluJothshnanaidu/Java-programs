package com.constructor;
//no arg constructor
public class Student {
    int sid;
    String sname;
    int sage;
    Student(){
    	System.out.println("no args constructor called");
    }
	public static void main(String[] args) {
     System.out.println("main method started");
     Student s1 = new Student();
     s1.sid = 001;
     s1.sname = "joshna";
     s1.sage = 21;
     
     System.out.println(s1.sid);
     System.out.println(s1.sname);
     System.out.println(s1.sage);
     
     Student s2 = new Student();
     s2.sid = 002;
     s2.sname = "lalitha";
     s2.sage = 22;
     
     System.out.println(s2.sid);
     System.out.println(s2.sname);
     System.out.println(s2.sage);
     
	}

}
