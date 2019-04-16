package extra.chap06_03;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "white";
		car.gearType = "auto";
		car.door = 4;
		
		Car car1 = new Car("yello", "auto", 2);
		
		System.out.println("car"+car.color+car.gearType+car.door);
		System.out.println("car1"+car1.color+car1.gearType+car1.door);

	}

}
