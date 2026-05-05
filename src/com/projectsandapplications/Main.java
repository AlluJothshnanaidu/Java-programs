package com.projectsandapplications;

public class Main {

	public static void main(String[] args) {
       Laptop l1 = new Laptop("HP", 13000);
       System.out.println("Laptop Details");
        l1.showdetails();
        l1.openlid();
        
        System.out.println( );
        
        SmartPhone s1 = new SmartPhone("vivo", 5000);
        System.out.println("SmartPhone Details");
        s1.showdetails();
        s1.makecall();
	}

}
