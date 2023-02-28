package edu.brandeis.cosi12b2.lec10;

/**
 * 
 * @author kbrumer
 *
 */
public class Account {
	private final int accountNumber;
	private int accountBalance;
	
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.accountBalance = 0;
	}
	
	// show the data nicely formatted
	public void showData() {
        System.out.printf("For account num [%d] the balance is [%d]", 
        		accountNumber, accountBalance);
    }
	
	// deposit to account
//    public void deposit(int a) {
//    	accountBalance = accountBalance + a; 
//    }

	// safer deposit to account
    public void deposit(int a) {
    	if (a < 0) {
    		// show error
    		System.out.println("You can not deposit a negative amount");
    	} else { 
    		accountBalance = accountBalance + a;
    	}
    }

    // add getters and setters appropriately
    public int getAccountBalance() {
		return accountBalance;
	}
    
    public int getAccountNumber() {
		return accountNumber;
	}
}
