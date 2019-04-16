package example.chap11_03_05;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=0; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;	//Counter 객체를 쓰레기로 만듬
			
			System.gc();	//쓰래기 수집기 실행 요청
		}

	}

}
