package com.projectsandapplications;

public class Device{ 
    String brand;
    int power;
    
    
    Device(String brand,int power){
    	this.brand = brand;
    	this.power = power;
    	
    }
    void showdetails() {
    	System.out.println("brand : "+brand);
    	System.out.println("power : "+power);
    	
    }
    
            
	

}
