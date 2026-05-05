package com.javaprograms;
//count objects using static block (constructor lekunda increment cheyyakunda).
public class Task2 {
    static  int count = 5;
	public static void main(String[] args) {
            new Task2();
            new Task2();
            new Task2();
            new Task2(); System.out.println("Objects created : "+count);
	}

}
// anynomous objects kuda count avutayi