package example.chap7_07_5;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.feild2 = "data2
		parent.method3();
		불가능
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";	//(가능)
		child.method3();		//(가능)

	}

}
