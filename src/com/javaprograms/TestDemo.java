package com.javaprograms;

public class TestDemo {
	public static void main(String[] args) {
		
	}
	static {
		TestDemo t1 = new TestDemo();
		t1.h();
	}

	public void h() {
		System.out.println("h");
		l();
	}

	public void l() {
		System.out.println("l");
		m();
	}

	public void m() {
		System.out.println("m");
	}
	

}