package com.javaprograms;

public class MyClass {

  void main(String[] args) {
		method1(10,20);
  }
	void method1(int a,int b) {
		int x = a+b;
		System.out.println(x);
		method2(x,90);
		}
	void method2(int a,int b) {
		int x = a-b;
		System.out.println(x);
		method3(x,90);
	}
    void method3(int a,int b) {
    	int x = a*b;
    	System.out.println(x);
    	method1(x,2);
    	}
    
	}


