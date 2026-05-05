package com.methods;
//NO ARGUMENT + WITH RETURN TYPE
public class TestDemoMethod5 {
 static {
	 System.out.println("static block");
 }
	  public static void main(String[] args) {
		 System.out.println("main method started");
		 System.out.println("The employee age is :"+getemployeeage());
		 double sal = getsalary();
		 double bonus = getbonus();
		 System.out.println("total sal :"+(sal+bonus));
		 System.out.println("getsalary :"+getbonus());

	}
	 static  int getemployeeage() {
		  int age = 22;
		  return age;
	  }
	 static double getsalary() {
		  double salary = 500000.00;
		  return salary;
	  }
	 static  double getbonus() {
		  double bonus = 2000.00;
		  return bonus;
	  }

}
