package game_project;


//상속 + 다중구현
//인터페이스는 extends 대신 implements 
//자바는 다중상속을 막아놓은 대신, 인터페이스는 다중 구현을 허용해놓았다.
//오버라이딩 빠르게 -> class명 클릭 후 Add unimplimented methods
interface PhoneInterface{
	int BOTTONS = 20;
	void sendCall();
	void receiveCall();
}


interface MobilePhoneInterface extends PhoneInterface{
	//인터페이스 끼리는 extends 로 상속받으면 된다.
	void sendSMS();
	void receiveSMS();
	
}

interface MP3interface {
	void play();
	void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x=y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3interface{
	//상속과 구현을 다 넣는 경우도 많다.
	@Override
	public void sendCall() {
		System.out.println("전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받기");		
	}

	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void stop() {
		System.out.println("재생 중지");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 보내기");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 받기");
	}

	
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

