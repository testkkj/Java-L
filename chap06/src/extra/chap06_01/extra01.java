package extra.chap06_01;

public class extra01 {

	public static void main(String[] args) {
		Tv tv = new Tv("����");
		
		System.out.println("TV ����: "+tv.color);
		
		tv.turnOn();
		tv.chanUp();
		tv.chanDown();
		tv.turnOff();

	}

}
