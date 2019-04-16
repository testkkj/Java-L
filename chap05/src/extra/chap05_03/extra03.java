package extra.chap05_03;

import java.util.Scanner;

public class extra03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] array = new String[3];
		for(int i=0; i<array.length; i++) {
			System.out.print("ют╥б>");
			array[i] = sc.nextLine();
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
