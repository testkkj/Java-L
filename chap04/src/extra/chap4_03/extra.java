package extra.chap4_03;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		int com = (int) (Math.random()*3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3) �߿� �ϳ� �Է��ϼ���>");
		int user = sc.nextInt();
		
		switch(user) {
		case 1:
			if(com == 1) {
				System.out.println("�����ϴ�.");
				break;
			} else if(com == 2) {
				System.out.println("�����ϴ�.");
				break;
			} else if(com == 3) {
				System.out.println("�̰���ϴ�.");
				break;
			}
		case 2:
			if(com == user) {
				System.out.println("�����ϴ�.");
				break;
			} else if(com == 3) {
				System.out.println("�����ϴ�.");
				break;
			} else if(com == 1) {
				System.out.println("�̰���ϴ�.");
				break;
			}
		case 3:
			if(com == user) {
				System.out.println("�����ϴ�.");
				break;
			} else if(com == 1) {
				System.out.println("�����ϴ�.");
				break;
			} else if(com == 2) {
				System.out.println("�̰���ϴ�.");
				break;
			}
		}

	}

}
