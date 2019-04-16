package extra.chap06_01;

public class extra01 {

	public static void main(String[] args) {
		Tv tv = new Tv("검정");
		
		System.out.println("TV 색은: "+tv.color);
		
		tv.turnOn();
		tv.chanUp();
		tv.chanDown();
		tv.turnOff();

	}

}
