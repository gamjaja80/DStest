package review;

abstract class Car{
	abstract void run();
}

class Bus extends Car{

	@Override
	void run() {
		System.out.println("I AM A BUS");
	}
	
}

class Taxi extends Car{

	@Override
	void run() {
		System.out.println("I AM A TAXI");
	}
	
}



public class AnonyClass {

	public static void main(String[] args) {
		
		new Car(){
			@Override
			void run() {
				System.out.println("Anonymous Class");
			}
		};
	}

}
