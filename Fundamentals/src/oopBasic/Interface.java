package oopBasic;

interface TestBankHead{
	default public void message() {
		System.out.println("Welcome to Test Bank!");
		System.out.println("--------------------------");
		System.out.println();
		
	};
	void openAccount();
	void closeAccount();
}


interface TestBank2{
	
	void deposit();
	void withdraw();
	void balace();
	
}

class Savings implements TestBank2, TestBankHead{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("DEPOSIT");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw");
		
	}

	@Override
	public void balace() {
		// TODO Auto-generated method stub
		System.out.println("BALANCE");
		
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("Open Account! ");
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("Close Account!");
		
	}
	
}
public class Interface {
	
	public static void main(String[] args) {
		
		Savings savings =  new Savings();
		savings.message();
		savings.openAccount();
		savings.closeAccount();
		savings.balace();
		savings.deposit();
		savings.withdraw();
		
	}

}
