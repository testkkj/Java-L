package extra.chap05_05;

import java.util.Scanner;

public class extra_05 {

	public static void main(String[] args) {
		String[][] array = {{"chair", "computer", "integer"},{"����","��ǻ��","����"}};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.println(array[0][j]+"��?");
				String s = sc.nextLine();
				if(s.equals(array[1][j])) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
			}
		}
		

	}

}
