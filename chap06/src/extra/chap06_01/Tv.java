package extra.chap06_01;

public class Tv {
	String color;
	
	public Tv(String color) {
		this.color = color;
	}
	
	void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	void chanUp() {
		System.out.println("채널을 올립니다..");
	}
	
	void chanDown() {
		System.out.println("채널을 내립니다.");
	}

}
