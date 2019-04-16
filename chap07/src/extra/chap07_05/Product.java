package extra.chap07_05;

public class Product {
	int p;
	int bp;
	public Product(int p) {
		this.p = p;
		this.bp = (int)(p/10);
	}

}

class Buyer {
	int money = 10000;
	int bp;
	void buy(Product p) {
		money = money-p.p;
		bp = bp+p.bp;
	}
}

class Tv extends Product{

	public Tv(int p) {
		super(p);
	}
	
}

class Computer extends Product{

	public Computer(int p) {
		super(p);
	}
	
}