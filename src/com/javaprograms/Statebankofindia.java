package com.javaprograms;

public class Statebankofindia {
	static int accountnumber = 123450;
	static String username;
	int balance;

	{
		accountnumber = accountnumber + 1;
	}

	public static void main(String[] args) {
		System.out.println("****Statebankofindia****");
		Statebankofindia t1 = new Statebankofindia();
		t1.username = "lalitha";
		t1.balance = 1000;
		System.out.println("create a userid:" + (accountnumber));
		System.out.println("username: "+ t1.username);
		System.out.println("balance: "+ t1.balance);
	}

}
