package game_project;


//��� + ���߱���
//�������̽��� extends ��� implements 
//�ڹٴ� ���߻���� ���Ƴ��� ���, �������̽��� ���� ������ ����س��Ҵ�.
//�������̵� ������ -> class�� Ŭ�� �� Add unimplimented methods
interface PhoneInterface{
	int BOTTONS = 20;
	void sendCall();
	void receiveCall();
}


interface MobilePhoneInterface extends PhoneInterface{
	//�������̽� ������ extends �� ��ӹ����� �ȴ�.
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
	//��Ӱ� ������ �� �ִ� ��쵵 ����.
	@Override
	public void sendCall() {
		System.out.println("��ȭ�ɱ�");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�ޱ�");		
	}

	@Override
	public void play() {
		System.out.println("���� ���");
	}

	@Override
	public void stop() {
		System.out.println("��� ����");
	}

	@Override
	public void sendSMS() {
		System.out.println("���� ������");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���� �ޱ�");
	}

	
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

