package example.chap7_04_1;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}

}
