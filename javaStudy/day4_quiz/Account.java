package javaStudy.day4_quiz;

public class Account {
	private static int balance;
	public static final int MIN_BALANCE=0;
	public static final int MAX_BALANCE=1000000;
	
	

	public static int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if((balance>MIN_BALANCE)&&(balance<MAX_BALANCE)) {
			Account.balance += balance;
			System.out.println("현재 잔고 :" + Account.getBalance());
		}else {
			System.out.println("입금액은" +MIN_BALANCE + "보다 많아야 하고 " + MAX_BALANCE +"보다 크면 안되요" );
			return;
		}
	}

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
	}
	
}
