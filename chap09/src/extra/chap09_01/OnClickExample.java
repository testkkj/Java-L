package extra.chap09_01;

public class OnClickExample {

	public static void main(String[] args) {
		OnClickListener call = new OnClickListener() {

			@Override
			public void onclick() {
				System.out.println("��ȭ�ɴ�.");
				
			}
			
		};
		
		OnClickListener message = new OnClickListener() {

			@Override
			public void onclick() {
				System.out.println("���ں�����.");
				
			}
			
		};

	}

}

interface OnClickListener {
	void onclick();
}