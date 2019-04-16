package example.chap08_04_02;

import example.chap08_02_05.RemoteControl;
import example.chap08_03_01.Audio;
import example.chap08_03_01.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;	//인터페이스 변수 선언
		
		rc = new Television();		//Television 객체를 인터페이스 타입에 대입
		rc.turnOn();				//인터페이스의 turnOn(),turnOff() 호출
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();			//Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();				//인터페이스의 turnOn(),turnOff() 호출
		rc.turnOff();
		rc.setMute(true);

	}

}
