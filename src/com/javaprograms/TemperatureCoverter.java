package com.javaprograms;

public class TemperatureCoverter {
	double fahrenheit;
	double celsius =30;
    //covert fahrenheit to celsius and calsius to fahrenheit.
	public static void main(String[] args) {
		System.out.println("***TemaparetureConverter***");
		TemperatureCoverter t1 = new TemperatureCoverter();
		
		t1.fahrenheit = ((t1.celsius * 9/5)+32);
		t1.celsius =((t1.fahrenheit-32)*5/9);
	    
		System.out.println("Fahrenheit value = "+ t1.celsius);
		System.out.println("Celsius value = "+ t1.fahrenheit);
		
	}

}
