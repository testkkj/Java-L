package exercise.chap7_06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call(1)");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call(2)");
	}

}
