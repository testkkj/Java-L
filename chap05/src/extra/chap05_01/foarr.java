package extra.chap05_01;

public class foarr {

	public static void main(String[] args) {
		int[] array = new int[5];
		int[] array1 = new int[9];
		int[] array2 = new int[9];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}
		
		for(int i=0; i<array.length; i++) {
			array1[i] = array[i];
		}
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.arraycopy(array, 0, array2, 0, 5);
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
