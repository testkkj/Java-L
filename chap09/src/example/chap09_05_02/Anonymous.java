package example.chap09_05_02;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
			
		}
		/*�ʵ� ����� �ʱⰪ ����*/
	};
	
	void method1() {
		//���� ���������� ����
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
				
			}
			/*���� ���� ����� �ʱⰪ ����*/
		};
		//���� ���� ���
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
