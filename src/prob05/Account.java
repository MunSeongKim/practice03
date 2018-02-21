package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo){
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int money){
		this.balance += money;
		System.out.println(this.accountNo + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money){
		if((this.balance-money) < 0){
			System.out.print(this.accountNo + " 계좌에 출금 가능한 잔액이 없습니다.");
			System.out.println(" 잔고는 " + this.balance + "만원입니다." );
			return ;
		}
		this.balance -= money;
		System.out.println(this.accountNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}
	
	
}