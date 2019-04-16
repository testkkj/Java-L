package exercise.chap6_17;

public class Printer {
	static int it;
	static boolean bl;
	static double db;
	static String st;
	
	static void println(int it) {
		Printer.it = it;
		System.out.println(Printer.it);
	}
	
	static void println(boolean bl) {
		Printer.bl = bl;
		System.out.println(Printer.bl);
	}
	
	static void println(double db) {
		Printer.db = db;
		System.out.println(Printer.db);
	}
	
	static void println(String st) {
		Printer.st = st;
		System.out.println(Printer.st);
	}

}
