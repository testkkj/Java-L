package example.chap08_05_02;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	/*�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����*/
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		/*�������̽����� ����� roll() �޼ҵ� ȣ��*/
	}

}
