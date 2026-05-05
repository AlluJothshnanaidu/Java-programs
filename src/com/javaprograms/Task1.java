package com.javaprograms;
//online food ordering system
import java.util.Scanner;

public class Task1 {
		static int totalcalulation(int a) {
			return a;
		}

		static double totalprize(double b) {
			return b;
		}
		static double addgst(double c) {
			return c;
		}
		static double adddeliverycharges (double d) {
			return d;
		}
		public static void main(String[] args) {
			Scanner Sc = new Scanner(System.in);
			System.out.println("enter the quantity");
			int a = Sc.nextInt();
			int cal = totalcalulation(a);
			System.out.println("total quantity:" + cal);
			System.out.println("enter the prize");
			double b = Sc.nextDouble();
			double pri = totalprize(b);
			System.out.println("total prize:" + pri);
			System.out.println("total quantity: " +(a+b));
			System.out.println("enter the gst");
			double c = Sc.nextInt();
			double gst = addgst(c);
			System.out.println("total prize:" + gst);
			System.out.println("total charges : "+(a+b+c));
			System.out.println("enter the delivery charges");
			double d = Sc.nextDouble();
			double charges = adddeliverycharges(d);
			System.out.println("total delivery:" + charges);
			System.out.println("total deliver charges :" +(a+b+c+d));
			
			Sc.close();
		}

		

	

	}


