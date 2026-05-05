package com.projectsandapplications;

import java.util.Scanner;

public class PersonalLoan {
    static  Scanner sc = new Scanner(System.in);
    
    static boolean getaadhaarcard() {
  	  System.out.println("enter the aadhaarcardno:");
  	  String aadhaarcard = sc.next();
//  	  System.out.println(aadhaarcard.matches("//d{12}"));
  	  return aadhaarcard.matches("\\d{12}");
    }
    static boolean getPancard() {
    	  System.out.println("enter the Pancard:");
    	  String Pancard = sc.next();
//    	  System.out.println(Pancard.matches("[A-Z]{5}[0-9]{4}[A-Z]");
    	  return Pancard.matches("[A-Z]{5}[0-9]{4}[A-Z]");
      }
    static boolean  getphoneno() {
    	  System.out.println("enter the phoneno:");
    	String phoneno = sc.next();
//    	  System.out.println(phoneno.matches("[6-9]\\d{9}"));
    	  return phoneno.matches("[6-9]\\d{9}");
      }
      
      static int getcibilscore() {
    	  System.out.println("enter the cibilscore:");
    	  int cibils = sc.nextInt();
    	  return cibils;
      }
       
      static double getsalary() {
    	  System.out.println("enter the salary:");
    	  double salary = sc.nextDouble();
    	  return salary;
      }
      
      static int getage() {
    	  System.out.println("enter the age:");
    	  int age = sc.nextInt();
    	  return age;
      }
        
      static String getaddress() {
		String address = " ";
		System.out.println("enter the flat no:");
		String flat = sc.next();
		
		System.out.println("enter the plot no:");
		sc.nextLine();
		String plot = sc.next();
		
		System.out.println("enter the city no:");
		String city = sc.next();
		
		System.out.println("enter the pin no:");
		String pin = sc.next();
		address = "flat :"+flat + ",plot :"+plot + ", city :"+city+ "pin : "+pin;
    	   return address;
      }
      
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("***personal loan Approval***");
        
        int cibilscore = getcibilscore();
        double salary = getsalary();
        int age = getage();
        
        boolean Pancard = getPancard();
        boolean aadhaarcard = getaadhaarcard();
        boolean phoneno = getphoneno();
        String address = getaddress();
        if(cibilscore>=700 && salary>=10000 && age>25 ) {
        	System.out.println("Enter into the first stage");
        	System.out.println("congratulations you got personal loan!!");
        
        }else {
        	System.out.println("sorry rejected the loan!!");
        }
    
	}

}
