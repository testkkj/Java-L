package exercise.chap6_16;

public class Printer {
	int it;
	boolean bl;
	double db;
	String st;
	
	void println(int it) {
		this.it = it;
		System.out.println(this.it);
	}
	
	void println(boolean bl) {
		this.bl = bl;
		System.out.println(this.bl);
	}
	
	void println(double db) {
		this.db = db;
		System.out.println(this.db);
	}
	
	void println(String st) {
		this.st = st;
		System.out.println(this.st);
	}

}
