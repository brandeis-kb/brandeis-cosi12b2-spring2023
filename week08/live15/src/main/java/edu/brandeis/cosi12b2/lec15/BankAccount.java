package edu.brandeis.cosi12b2.lec15;

public class BankAccount {
	
	/**
	 * Invariant: Balance can never be negative
	 */
	private float balance;
	
	public BankAccount(float balance) {
		// complete implementation
		this.balance = balance;
	}
	
	public void deposit(float amount) {
		balance += amount;
	}
	
	public boolean withdraw(float amount) {
		// complete implementation
		return true;
	}
	
	public float getBalance() {
		return balance;
	}

}