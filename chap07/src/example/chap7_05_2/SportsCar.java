package example.chap7_05_2;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//�������̵��� �� �� ����
	/*
	@Override
	public void stop() {
		System.out.println("����Ʈī�� ����");
		speed = 0;
	}
	*/

}
