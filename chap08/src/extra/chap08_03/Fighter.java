package extra.chap08_03;

public class Fighter extends Unit implements Fightable {

	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		if(fighter instanceof Unit) {
			System.out.println("fighter ��ü�� Unit Ŭ������ �ڼ��Դϴ�.");
		}
		if(fighter instanceof Movealbe) {
			System.out.println("fighter ��ü�� Movealbe �������̽��� �����߽��ϴ�.");
		}
		if(fighter instanceof Attackable) {
			System.out.println("fighter ��ü�� Attackable �������̽��� �����߽��ϴ�.");
		}
		if(fighter instanceof Fightable) {
			System.out.println("fighter ��ü�� Fightable �������̽��� �����߽��ϴ�.");
		}
		if(fighter instanceof Object) {
			System.out.println("fighter ��ü�� Object Ŭ������ �ڼ��Դϴ�.");
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
