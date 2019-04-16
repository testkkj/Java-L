package exercise.chap7_06;

public class Child extends Parent {
	public String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call(3)");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call(4)");
	}

}
