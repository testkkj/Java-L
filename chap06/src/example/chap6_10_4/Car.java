package example.chap6_10_4;



public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		//Car1~6사이에 있음
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
