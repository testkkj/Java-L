package extra.chap4_01;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �ϳ� �Է��ϼ���>");
		int inum = sc.nextInt();
		if(inum == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
			System.out.println("�Է��Ͻ� ���ڴ� " + inum + "�Դϴ�");
		}
		
	}

}
