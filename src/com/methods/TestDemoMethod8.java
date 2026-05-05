package com.methods;

public class TestDemoMethod8 {
	static void method1(TestDemoMethod8 t){
		System.out.println("method1");
		t.method2();
		
	}
	void method2(){
		System.out.println("method2");
		
	}

	public static void main(String[] args) {
        System.out.println(" main method stared");
        TestDemoMethod8 t = new TestDemoMethod8();
        method1(t);
        
	}

}
//import java.util.Scanner;
//class TestDemoMethod8{
//   static Scanner sc = new Scanner(System.in);
//   int m1(float a)
//   {
//    System.out.println("m1 method.."+a);
//	return sc.nextInt();
//   }
//   static short m2(TestDemoMethod8 x)
//   {
//    System.out.println("m2 method..");
//	System.out.println(x.m1(sc.nextFloat()));
//	return sc.nextShort();
//   }
//   public static void main(String[] args)
//   {
//      TestDemoMethod8 obj = new TestDemoMethod8();
//	  System.out.println(m2(obj));
//   }
//}