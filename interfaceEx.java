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
	//인터페이스는 extends 대신 implements 
	//자바는 다중상속을 막아놓은 대신, 인터페이스는 다중 구현을 허용해놓았다.
	//오버라이딩 빠르게 -> class명 클릭 후 Add unimplimented methods
	
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
