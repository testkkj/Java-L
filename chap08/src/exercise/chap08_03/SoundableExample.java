package exercise.chap08_03;

public class SoundableExample {
	private static void printSound(Soundable soudnable) {
		System.out.println(soudnable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
