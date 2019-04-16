package extra.chap07_04;

public class Ambulance extends Car{
	@Override
	void drive() {
		System.out.println("Ambulance_Drive, Brrrrr");
	}
	
	void siren() {
		System.out.println("siren~~~~~");
	}

}
