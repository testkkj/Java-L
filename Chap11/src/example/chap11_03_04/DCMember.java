package example.chap11_03_04;

import java.util.Arrays;

public class DCMember implements Cloneable {
	public String name;
	public int age;
	public int[] scores;	//���� Ÿ�� �ʵ� (���� ���� ���)
	public Car car;
	
	public DCMember(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//���� ���� ���縦 �ؼ� name, age�� ��������.
		DCMember cloned = (DCMember) super.clone();	//Object�� clone() ȣ��
		//scores�� ���� ���� �Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}
	
	public DCMember getMember() {
		DCMember cloned = null;
		try {
			cloned = (DCMember) clone();	//�����ǵ� clone() �޼ҵ� ȣ��
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
