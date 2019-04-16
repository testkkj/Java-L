package extra.chap07_07;

public abstract class Unit {
	int x;
	int y;
	
	abstract void move(int x, int y);
	void stop() {
	}

}

class Marin extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}