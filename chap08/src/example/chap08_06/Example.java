package example.chap08_06;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();	//InterfaceA ������ methodA()�� ȣ�� ����
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();	//InterfaceB ������ methodB()�� ȣ�� ����
		
		InterfaceC ic = impl;
		ia.methodA();
		ia.methodA();
		ia.methodA();
		System.out.println();
		//InterfaceA ������ methodA(), methodB(), methodC() ��� ȣ�� ����

	}

}
