package com.methods;

public class TestDemoMethod3 {
	static TestDemoMethod3 t = new TestDemoMethod3();
      static void method1() {
    	  System.out.println("method1 called");
    	  t.method2();
      }
      void method2() {
    	  System.out.println("method2 called");
    	t.method3();
    	 method4();
      }
    
	  void method4() {
    	  System.out.println("method4 called");
    	  t.method5();
      }
      void method5() {
    	  System.out.println("method5 called");
    	  
      }
      void method3() {
    	  System.out.println("method3 called");
      }
	public static void main(String[] args) {
    System.out.println("main method started");
    t.method1();
	}

}
