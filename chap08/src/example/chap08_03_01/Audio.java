package example.chap08_03_01;

import example.chap08_02_05.RemoteControl;

public class Audio implements RemoteControl {
	//�ʵ�
	private int volume;

	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
	}

	//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: "+volume);
		/*�������̽� ����� �̿��ؼ� volume �ʵ��� ���� ����*/
	}

}
