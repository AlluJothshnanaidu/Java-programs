package com.constructor;
//parameterized constructor
public class Employee {
         String eid;
         String ename;
         double salary;
         
         Employee(){
        	 System.out.println("no arg constructor called");
        	 eid = "jfs-101";
        	 ename = "joshna";
        	 salary = 40000;
        	 
         }
         Employee(String eid, String ename, double salary){
        	 System.out.println("parameterized constructor called");
        	 this.eid = eid;
        	 this.ename = ename;
        	 this.salary = salary;
        	 
         }
	public static void main(String[] args) {
   System.out.println("main method started");
   Employee e1 = new Employee();
   e1.display();
   Employee e2 = new Employee("jfs-102", "lalitha", 500000);
   e2.display();
   }


 void display() {
	System.out.println("empid : "+eid); 
	System.out.println("emname : "+ename);
	System.out.println("empsalary : "+salary);
 }
 }