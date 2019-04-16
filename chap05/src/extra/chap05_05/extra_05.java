package extra.chap05_05;

import java.util.Scanner;

public class extra_05 {

	public static void main(String[] args) {
		String[][] array = {{"chair", "computer", "integer"},{"의자","컴퓨터","정수"}};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.println(array[0][j]+"뜻?");
				String s = sc.nextLine();
				if(s.equals(array[1][j])) {
					System.out.println("정답");
				}else {
					System.out.println("오답");
				}
			}
		}
		

	}

}
