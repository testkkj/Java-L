package exercise.chap6_20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}

	private static void createAccount() {
		System.out.println("----------");
		System.out.println("1.���»���");
		System.out.println("----------");
		System.out.println("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("������: ");
		String owner = scanner.next();
		System.out.println("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("----------");
		System.out.println("2.���¸��");
		System.out.println("----------");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+accountArray[i].getOwner()+accountArray[i].getBalance());
			}
		}
		
	}

	private static void deposit() {
		System.out.println("----------");
		System.out.println("3.����");
		System.out.println("----------");
		System.out.println("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("���ݾ�: ");
		int balance = scanner.nextInt();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(balance+accountArray[i].getBalance());
				break;
			}
		}
		
		
	}

	private static void withdraw() {
		System.out.println("----------");
		System.out.println("4.���");
		System.out.println("----------");
		System.out.println("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.println("��ݾ�: ");
		int balance = scanner.nextInt();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(accountArray[i].getBalance()-balance);
				break;
			}
		}
		
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		
		
		return null;
	}
}
