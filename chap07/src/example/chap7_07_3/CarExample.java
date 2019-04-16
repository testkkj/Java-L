package example.chap7_07_3;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<=50; i++) {
			int problemLocation = car.run();
			
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire·Î ±³Ã¼");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
		}
		System.out.println("-----------------------------------");
	}

}
