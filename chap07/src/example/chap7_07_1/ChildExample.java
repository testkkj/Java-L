package example.chap7_07_1;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();	//�ڵ� Ÿ�� ��ȯ
		parent.method2();	//�����ǵ� �޼ҵ尡 ȣ���
		/*
		parent.method3();
		ȣ�� �Ұ���
		*/

	}

}
