package extra.chap09_02;

public class OnClickExample {

	public static void main(String[] args) {
		OnClickListener call = new Call();
		call.onclick();
		
		OnClickListener message = new Message();
		message.onclick();

	}

}

interface OnClickListener {
	void onclick();
}

class Call implements OnClickListener {

	@Override
	public void onclick() {
		System.out.println("��ȭ�ɴ�.");
		
	}
	
}

class Message implements OnClickListener {

	@Override
	public void onclick() {
		System.out.println("���ں�����.");
		
	}
	
}