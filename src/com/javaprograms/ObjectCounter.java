package com.javaprograms;
//Write a java to count the number of objects created with out using instance block.
public class ObjectCounter {
      static int count = 0;
       
	 
		ObjectCounter(){
			count++;
		}
		public static void main(String[] args) {
			ObjectCounter obj = new ObjectCounter();
			ObjectCounter obj1 = new ObjectCounter();
			ObjectCounter obj2 = new ObjectCounter();
			ObjectCounter obj3 = new ObjectCounter();
			System.out.println("Number of objects created : "+ ObjectCounter.count);
			
	}

}
   