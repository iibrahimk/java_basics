package oopBasic;


abstract class Testbank{
	void message() {
		System.out.println("Welcome to Test bank");
		System.out.println();
	}
	abstract void openAccount();
	abstract void closeAccount();
}

abstract class BankAccount extends Testbank{
	
	@Override
	void openAccount() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		
	}
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
}

class SavingsAccount extends BankAccount{
	
	@Override
	void openAccount() {
		System.out.println("Open account");
	}
	
	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close account");
	}

	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw");
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Balance");
	}
	
}

class CurrentAccount extends BankAccount{
	@Override
	void openAccount() {
		System.out.println("Open account");
	}
	
	@Override
	void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close account");
	}


	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Current Account Deposit");
		
	}

	@Override
	void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Current Account Withdraw");
	}

	@Override
	void balance() {
		// TODO Auto-generated method stub
		System.out.println("Current Account Balance");
	}
	
}

public class AbstractClass {
	
	public static void main(String[] args) {
		SavingsAccount savingAccount =  new SavingsAccount();
		
		savingAccount.message();
		savingAccount.openAccount();
		savingAccount.closeAccount();
		savingAccount.balance();
		savingAccount.deposit();
		savingAccount.withdraw();
		
		System.out.println("_____________________________________");
		
		CurrentAccount currentAccount =  new CurrentAccount();
		
		currentAccount.balance();
		currentAccount.deposit();
		currentAccount.withdraw();
		currentAccount.openAccount();
		currentAccount.closeAccount();
	}

}
