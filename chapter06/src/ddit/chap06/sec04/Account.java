package ddit.chap06.sec04;
// 계좌
// 소유자 이름, 계좌번호, 잔고의 속성이 있고
// 입금(deposit), 출금(withdraw), 잔고확인(getBalance)메서드
public class Account {
	private String owner;
	private String accountNo;
	private int balance;
	
	public Account() {
		this("홍길동","1234-12-1234",1000);
	}
	
	public Account(String owner, String accountNo) {
		this(owner, accountNo,5000);
		
	}
	
	public Account(String owner, String accountNo, int balance) {
		this.owner=owner;
		this.accountNo=accountNo;
		this.balance=balance;
		
	}
	
	public void deposit(int money) { //저축 할 금액
		balance+=money;
		System.out.println("[입금]");
		getBalance();
		
	}
	
	public int withdraw(int money) { //출금 금액
		if(balance>=money) {
			balance-=money;
			System.out.println("[출금]");
			getBalance();	
			return money;
		}else {
			System.out.println("계좌 잔액이 부족합니다.");
			getBalance();
			return 0;
		}

	}
	
	public void getBalance() {
		System.out.println("-------------------------");
		System.out.println("고객명 : "+owner+"\n잔고 : "+balance);
		System.out.println("-------------------------\n");
		
		
	}

}
