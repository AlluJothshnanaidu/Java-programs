package com.javaprograms;

public class PencilCalculator {
	
	
	public static void main(String[] args) {

		int totalmoney = 100;
		int pencilcost = 7;
		int pencilsbought = totalmoney / pencilcost;
		int remainingmoney = totalmoney % pencilcost;

		System.out.println("totalmoney:" +totalmoney);
		System.out.println("cost of one pencil:" +pencilcost);
		System.out.println("remaining money:" +remainingmoney );
		System.out.println("Pencils Bought: "+pencilsbought);

	}

}
