package com.javaprograms;

import java.util.Scanner;

public class BankEmployee {

	public static void main(String[] args) {
		BankEmployee s1 = new BankEmployee();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your money:");
			int money = sc.nextInt();
			int totalmoney = s1.getMyMoney( money );
			System.out.println("total money : "+ totalmoney);
			System.out.println("Enter your amount: ");
			double deposit = sc.nextDouble();
			double amount = s1.getDeposit(deposit);
			System.out.println("add your amount: "+ amount);
			 
			double total = totalmoney + amount;
			System.out.println("after deposit: "+ total);
			double withdraw = sc.nextDouble();
			double debit = s1.getWithDraw(withdraw);
			System.out.println("Your deposit money : "+ debit);
//		double total1 = total + debit;
//		System.out.println("after debit money: "+ total);
		}
		
	}

	 double getWithDraw(double withdraw) {
		return withdraw;
	}

	 double getDeposit(double deposit) {
		return deposit;
	}

	 int getMyMoney(int money) {
		return money;
	}
}
	    

