package example.chap08_07_01;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2() ����");
	}

}
