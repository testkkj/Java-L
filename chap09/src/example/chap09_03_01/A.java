package example.chap09_03_01;

public class A {
	//�ν��Ͻ� �ʵ�
	B field1 = new B();	//(o)
	C field2 = new C();	//(o)
	
	//�ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();	//(o)
		C var2 = new C();	//(o)
	}
	
	//���� �ʵ� �ʱ�ȭ
	//static B field3 = new B();	//(x)
	static C field4 = new C();	//(o)
	
	//���� �޼ҵ�
	static void method2() {
		//B var1 = new B();	//(x)
		C var2 = new C();	//(o)
	}
	
	//�ν��Ͻ� ��� Ŭ����
	class B {}
	
	//���� ��� Ŭ����
	static class C {}

}
