package com.methods;

public class TestDemoMethod2 {
    public static void show() {
    	System.out.println("show method called");
    }
	public static void main(String[] args) {
      System.out.println("main method started");
      TestDemoMethod2 t = new TestDemoMethod2();
      t.hello();
      show();
      System.out.println("main method ended");
      
	}
      public void hello() {
    	  System.out.println("hello method started");
      }
}
