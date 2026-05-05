package com.javaprograms;

public class Operators {
	int a;
    int b;
	public static void main(String[] args) {
            System.out.println("***********");
            Operators o1 = new Operators();
            o1.a = 5;
            o1.b = 3;
             
            System.out.println("operators : "+ ( o1.a & o1.b));
            System.out.println("operators : "+ (o1.a | o1.b));
            System.out.println("operators : "+ (o1.a ^o1.b));
	}

}
