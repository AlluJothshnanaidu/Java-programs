package com.javaprograms;

public class Vehcile {
   String brand;
    Vehcile(String brand){
    	this.brand = brand;
    }

}
  class Car extends Vehcile {    
   String name;
   String model;
   double price;
   Car( String brand, String name, String model, double price){
	   
   super(brand);
       this.name = name;
       this.model = model;
       this.price = price;
       
  }
  }
  
  
  class ElectricCar extends Car{
	  int batterycapacity;
	  ElectricCar(String brand, String name, String model, double price, int batterycapacity){  
	  super(brand, name,model,price);
	  this.batterycapacity = batterycapacity;
	  }
	  
  
  
  
	public static void main(String[] args) {
        System.out.println("main method called");
        ElectricCar c1 = new  ElectricCar("nexa", "joshna","v23", 1200000, 1000);
        
        c1.show();
//        Car c1 = new Car();
//        ElectricCar c1 = new  ElectricCar();
	}
 
  

  void show(){
	  System.out.println("Brand name  = "+ brand);
	  System.out.println("vechile holdername = "+ name);
	  System.out.println("model of the vehcile = "+ model);
	  System.out.println("price of the vehcile = "+ price);
	  System.out.println("battery capacity of vehcile = "+ batterycapacity);
      
  }
  }
  
  

  