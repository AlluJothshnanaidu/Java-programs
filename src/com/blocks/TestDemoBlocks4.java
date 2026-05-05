package com.blocks;

public class TestDemoBlocks4 {
static TestDemoBlocks4 t = new TestDemoBlocks4();

static {
	System.out.println("static block1 called");//static block 
}
static {
	System.out.println("static block2 called");//static block
}
	public static void main(String[] args) {
		System.out.println("main method started");

	}
	{
		System.out.println("instance block1 called");//instance block
	}
	{
		System.out.println("instance block2 called");//instance block
	}
}
