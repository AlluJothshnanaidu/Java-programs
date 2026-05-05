package com.blocks;

public class TestDemoBlocks2 {
    
	
	
	public static void main(String[] args) throws ClassNotFoundException {
     System.out.println("main method started");//main method
     TestDemoBlocks2 t1 = new TestDemoBlocks2();//object created
     TestDemoBlocks3 t3 = new TestDemoBlocks3();
	}
	static {
	   	 System.out.println("static block called");//static block
	   
	    }
	{
   	 System.out.println("instance block called");//instance block
   	 
    }
}
