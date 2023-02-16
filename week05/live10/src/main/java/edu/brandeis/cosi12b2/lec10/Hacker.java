package edu.brandeis.cosi12b2.lec10;

public class Hacker {
	public static void main(String[] args) {
		Account account = new Account(1234);
		account.accountBalance = -100;
		// account.deposit(-100);
		account.showData();
	}
}
