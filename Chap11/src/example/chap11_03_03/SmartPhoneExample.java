package example.chap11_03_03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);	//myPhone.toString()�� �ڵ� ȣ���ؼ� ���ϰ��� ���� �� ���

	}

}
