package extra.chap09_07;

public class A {
	class B {
		int iv = 10;
		int cv = 10;
		final static int CONST = 100;
	}
	
	static class C {
		int iv = 20;
		static int cv = 200;
	}
	
	void method() {
		class D {
			int iv = 30;
			int cv = 30;
			final static int CONST = 300;
		}
	}

}
