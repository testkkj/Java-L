package extra.chap07_04;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		//Car car2 = new FireEngine();
		Car car2 = new Car();
		FireEngine fe = null;
		Ambulance am = new Ambulance();
		
		fe = new FireEngine();
		fe.water();
		car.drive();
		if(car2 instanceof FireEngine) {
			fe = (FireEngine)car2;
			fe.drive();
		} else {
			System.out.println("���� Ÿ�� ��ȯ �Ұ���");
		}
		am.siren();

	}

}
