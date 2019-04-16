package extra.chap05_04;

public class extra_04 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		int[][] array = new int[5][5];
		
		for(i=0; i<array.length; i++) {
			System.out.println();
			for(j=0; j<array[i].length; j++) {
				int ran = (int) ((Math.random()*9)+1);
				array[i][j] = ran;
				System.out.print(array[i][j]);
				
			}
		}

	}

}
