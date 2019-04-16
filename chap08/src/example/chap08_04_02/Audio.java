package example.chap08_04_02;

import example.chap08_02_05.RemoteControl;

public class Audio implements RemoteControl {
	//�ʵ�
	private int volume;
	private boolean mute;

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
	
	//����Ʈ �޼ҵ� ������
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� ó���մϴ�.");
		}/*���� ������� �ۼ�*/
	}

}