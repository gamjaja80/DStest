package game_project;

public class interfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Playable{
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void pause();
    public abstract void stop();

}

interface Display{    
    public abstract void display();
    
}


class Video implements Playable, Display{
	//�������̽��� extends ��� implements 
	//�ڹٴ� ���߻���� ���Ƴ��� ���, �������̽��� ���� ������ ����س��Ҵ�.
	//�������̵� ������ -> class�� Ŭ�� �� Add unimplimented methods
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}   
   
}
