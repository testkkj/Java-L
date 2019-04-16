package extra.chap09_07;

import extra.chap09_07.A.C;

public class InnerTest {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.C c = new A.C();
		
		System.out.println(b.CONST);
		System.out.println(C.cv);

	}

}
