package example.chap08_05_03;

import example.chap08_05_02.HankookTire;
import example.chap08_05_02.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
