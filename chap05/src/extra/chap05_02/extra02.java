package extra.chap05_02;

public class extra02 {
	
	public static void main(String[] args) {
		int[] array = {98,53,78,92,65,84};
		int max = 98;
		int min = 98;
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			} else if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
