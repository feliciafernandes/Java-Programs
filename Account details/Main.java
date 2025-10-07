package banking;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.createAccount(1001, 5000);
		bank.createAccount(1002, 2000);
		
		bank.deposit(1001, 1000);
		bank.deposit(1002, 5000);
		
		bank.withdraw(1002, 500);
		
		bank.checkBalance(1001);
		bank.checkBalance(1002);
	}

}
