package banking;

import java.util.HashMap;

public class Bank {
	private HashMap<Integer,Double> accounts = new HashMap<>();
	
	public void createAccount(int accNo,double balance) {
		accounts.put(accNo,balance);
		System.out.println("Creating account "+accNo+" with "+balance);
	}
	
	public void deposit(int accNo,double amt) {
		if(accounts.containsKey(accNo)) {
			double newBalance = accounts.get(accNo)+amt;
			accounts.put(accNo,newBalance);
			System.out.println("Deposit "+amt+" in account "+accNo+" ->Balance ="+newBalance);
		}else {
			System.out.println("Account "+accNo+" not found");
		}
	}
	public void withdraw(int accNo,double amt) {
		if(accounts.containsKey(accNo)) {
			double balance = accounts.get(accNo);
			if(balance >=amt) {
				double newBalance = balance - amt;
				accounts.put(accNo, newBalance);
				System.out.println("Withdraw "+amt+" from account "+accNo+" -> Balance ="+newBalance);
			}else {
				System.out.println("Insufficient balance in account "+accNo);
			}
		}else {
			System.out.println("Account "+accNo+" not found");
		}
	}
	
	public void checkBalance(int accNo) {
		if(accounts.containsKey(accNo)) {
			System.out.println("Account "+accNo+": "+accounts.get(accNo));
		}else {
			System.out.println("Account "+accNo+" not found");
		}
	}
}
