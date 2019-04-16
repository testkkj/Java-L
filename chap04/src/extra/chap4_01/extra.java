package extra.chap4_01;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요>");
		int inum = sc.nextInt();
		if(inum == 0) {
			System.out.println("입력하신 숫자는 0 입니다");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다");
			System.out.println("입력하신 숫자는 " + inum + "입니다");
		}
		
	}

}
