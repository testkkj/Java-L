package example.chap6_10_4;



public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		//Car1~6���̿� ����
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
