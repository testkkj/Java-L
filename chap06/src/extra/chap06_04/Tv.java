package extra.chap06_04;

public class Tv {
	String color = "gray";
	boolean power;
	int channel;
	
	void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	void chanUp() {
		++channel;
	}
	
	void chanDown() {
		--channel;
	}

}
