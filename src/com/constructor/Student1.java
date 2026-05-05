package com.constructor;
//parameterized constructor
public class Student1 {
       int  sid;
       String sname;
       int sage;
       Student1(){
    	   System.out.println("no arg constructor called!!");
       }
       Student1(int sid,String sname,int sage){
    	   System.out.println("parameterized constructor called!!");
    	   this.sid = sid;
    	   this.sname = sname;
    	   this.sage = sage;
       }
	public static void main(String[] args) {
      System.out.println("main method called!!");
      Student1 s1 = new Student1(01,"joshna",21);
      s1.show();
      Student1 s2 = new Student1(02,"lalitha",22);
      s2.show();
      
      System.out.println("main method ended!!");
	}


 void show() {
	 System.out.println(sid);
	 System.out.println(sname);
	 System.out.println(sage);
	 
 }
}