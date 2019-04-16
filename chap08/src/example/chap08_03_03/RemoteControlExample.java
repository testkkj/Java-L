package example.chap08_03_03;

import example.chap08_02_05.RemoteControl;
import example.chap08_03_01.Audio;
import example.chap08_03_01.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;	//�������̽� ���� ����
		
		rc = new Television();		//Television ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();				//�������̽��� turnOn(),turnOff() ȣ��
		rc.turnOff();
		
		rc = new Audio();			//Audio ��ü�� �������̽� Ÿ�Կ� ����
		rc.turnOn();				//�������̽��� turnOn(),turnOff() ȣ��
		rc.turnOff();

	}

}
