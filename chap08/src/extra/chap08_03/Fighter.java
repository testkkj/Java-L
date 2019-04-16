package extra.chap08_03;

public class Fighter extends Unit implements Fightable {

	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		if(fighter instanceof Unit) {
			System.out.println("fighter 객체는 Unit 클래스의 자손입니다.");
		}
		if(fighter instanceof Movealbe) {
			System.out.println("fighter 객체는 Movealbe 인터페이스를 구현했습니다.");
		}
		if(fighter instanceof Attackable) {
			System.out.println("fighter 객체는 Attackable 인터페이스를 구현했습니다.");
		}
		if(fighter instanceof Fightable) {
			System.out.println("fighter 객체는 Fightable 인터페이스를 구현했습니다.");
		}
		if(fighter instanceof Object) {
			System.out.println("fighter 객체는 Object 클래스의 자손입니다.");
		}


	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Object {

}

class Unit extends Object {
	int chp;
	int x;
	int y;
	
}

interface Movealbe {
	void move(int x, int y);
	
}

interface Attackable {
	void attack(Unit u);
	
}

interface Fightable extends Movealbe, Attackable {
	
}
