package extra.chap4_02;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �ϳ� �Է��ϼ���>");
		int inum = sc.nextInt();
		
		switch(inum) {
		case 3:
		case 4:
		case 5:
			System.out.println("���� ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("���� ������ �ܿ��Դϴ�.");
			break;
		}

	}

}
