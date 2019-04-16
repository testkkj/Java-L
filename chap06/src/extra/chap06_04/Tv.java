package extra.chap06_04;

public class Tv {
	String color = "gray";
	boolean power;
	int channel;
	
	void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	
	void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	
	void chanUp() {
		++channel;
	}
	
	void chanDown() {
		--channel;
	}

}
