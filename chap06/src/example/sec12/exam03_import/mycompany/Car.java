package example.sec12.exam03_import.mycompany;

import example.sec12.exam03_import.hankook.*;
import example.sec12.exam03_import.hymdai.Engine;
import example.sec12.exam03_import.kumho.*;

public class Car {

	public static void main(String[] args) {
		//ÇÊµå
		Engine engine = new Engine();
		SnowTire tire1 = new SnowTire();
		BigWidthTire tire2 = new BigWidthTire();
		example.sec12.exam03_import.hankook.Tire tire3 = new example.sec12.exam03_import.hankook.Tire();
		example.sec12.exam03_import.kumho.Tire tire4 = new example.sec12.exam03_import.kumho.Tire();

	}

}
