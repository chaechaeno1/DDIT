package ddit.chap06.sec04;

public class AccountExample {

	public static void main(String[] args) {
		Account acc1 = new Account(); //기본 생성자
		acc1.getBalance();
		
		acc1.deposit(50000);
		acc1.withdraw(30000);
		acc1.withdraw(30000);
		
	}

}
