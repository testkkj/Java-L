package example.chap2_03_02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		
		int i = 128;
		
		if ( (i > Byte.MAX_VALUE) || (i < Byte.MIN_VALUE) ) {
			
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
			
		} else {
			
			byte b = (byte) i;
			
			System.out.println(b);
			
		}

	}

}
