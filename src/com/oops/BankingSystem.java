package com.oops;

class Account{
	 double balance;
	 
	 public Account(double balance) {
		 this.balance = balance;
	 }
	 public double calculateInterest() {
		return 0;
		
	 }
}

class SavingsAccount extends Account{
	public SavingsAccount(double balance) {
		super(balance);
	}
	public double CalculateInterest() {
		return balance *0.06;
		
	}
		
}
class CurrentAccount extends Account{
	public CurrentAccount(double balance) {
		super(balance);
	}
		
	
	public double CalculateInterest() {
		return balance *0.02;
		
	}
}
public class BankingSystem {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(10000);
		CurrentAccount ca = new CurrentAccount(20000);
		
		System.out.println("SavingsAccount : "+sa.CalculateInterest());
		System.out.println("CurrentAccount : "+ca.CalculateInterest());
	}

}
