package com.blocks;

public class TestDemoBlocks3 {
//	static TestDemoBlocks3 t1 = new TestDemoBlocks3();
	static {
		System.out.println("static block called *********");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemoBlocks3 t2 = new TestDemoBlocks3();
		
	}
	{
		System.out.println("instance block called-------");
	}
	}
