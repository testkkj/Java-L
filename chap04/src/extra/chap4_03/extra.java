package extra.chap4_03;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		int com = (int) (Math.random()*3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나 입력하세요>");
		int user = sc.nextInt();
		
		switch(user) {
		case 1:
			if(com == 1) {
				System.out.println("비겼습니다.");
				break;
			} else if(com == 2) {
				System.out.println("졌습니다.");
				break;
			} else if(com == 3) {
				System.out.println("이겼습니다.");
				break;
			}
		case 2:
			if(com == user) {
				System.out.println("비겼습니다.");
				break;
			} else if(com == 3) {
				System.out.println("졌습니다.");
				break;
			} else if(com == 1) {
				System.out.println("이겼습니다.");
				break;
			}
		case 3:
			if(com == user) {
				System.out.println("비겼습니다.");
				break;
			} else if(com == 1) {
				System.out.println("졌습니다.");
				break;
			} else if(com == 2) {
				System.out.println("이겼습니다.");
				break;
			}
		}

	}

}
