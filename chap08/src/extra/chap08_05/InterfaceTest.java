package extra.chap08_05;

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());

	}

}

interface I {
	public abstract void play();
}

class A implements I {

	@Override
	public void play() {
		System.out.println("play a");
		
	}
	
	public void autoPlay(I i) {
		i.play();
		
	}
	
}

class B implements I {

	@Override
	public void play() {
		System.out.println("play b");
		
	}
	
}

class C implements I {

	@Override
	public void play() {
		System.out.println("play c");
		
	}
	
}