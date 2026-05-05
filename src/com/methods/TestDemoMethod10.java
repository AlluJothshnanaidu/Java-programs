package com.methods;

public class TestDemoMethod10 {
	static void method1(TestDemoMethod10 t) {
		System.out.println("static method called");
		t.method2();
	}
	void method2() {
		System.out.println("non static method called");
	}

	public static void main(String[] args) {
       System.out.println("main method started");
       TestDemoMethod10 t = new TestDemoMethod10();
       method1(t);
       t.method2();
	}

}
