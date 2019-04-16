package extra.chap06_04;

public class Tvexample {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.power = true;
		System.out.println("color"+tv.color);
		
		if(tv.power) {
			tv.turnOn();
		}
		
		System.out.println("channel"+tv.channel);
		tv.turnOff();

	}

}
