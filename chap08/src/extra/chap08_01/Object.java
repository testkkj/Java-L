package extra.chap08_01;

public class Object {

}

class Unit extends Object {
	int chp;
	int x;
	int y;
	
}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
}

interface Movealbe {
	void move(int x, int y);
	
}

interface Attackable {
	void attack(Unit u);
	
}

interface Fightable extends Movealbe, Attackable {
	
}
