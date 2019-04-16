package extra.chap07_03;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new FireEngine();
		FireEngine fe = null;
		Ambulance am = new Ambulance();
		
		fe = new FireEngine();
		fe.water();
		car.drive();
		fe = (FireEngine)car2;
		fe.drive();
		am.siren();

	}

}
