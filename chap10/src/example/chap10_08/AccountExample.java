package example.chap10_08;

import example.chap10_07_01.BalanceInsufficientException;
import example.chap10_07_02.Account;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�:"+account.getBalance());
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}

}