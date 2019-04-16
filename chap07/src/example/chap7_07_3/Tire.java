package example.chap7_07_3;

public class Tire {
	//�ʵ�
	public int maxRotation;			//�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;	//���� ȸ����
	public String location;			//Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire ����: " +
		(maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
	}

}