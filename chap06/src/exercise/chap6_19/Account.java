package exercise.chap6_19;

public class Account {
	int balance;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			this.balance = balance;
		}

	}

}
