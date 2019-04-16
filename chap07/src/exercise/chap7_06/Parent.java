package exercise.chap7_06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("Parent() call(1)");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call(2)");
	}

}
