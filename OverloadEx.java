package game_project;

public class OverloadEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car("red");
		Car momCar = new Car("white", "kia", 2);
		
		myCar.output();
		yourCar.output();
		momCar.output();
	}

}


class Car{
	String color;
	String name;
	int door;
	
	Car(){
		//color = "black";
		//name = "BMW"
		//door = 4;
		this("black", "BMW", 4);
	}
	
	Car(String color){
		this.color = color;
	}
	
	Car(String color, String name, int door){
		this.color = color;
		this.name = name;
		this.door = door;
	}
	
	void output() {
		System.out.println(this.color + " / " + this.name + " / " + this.door);
	}
	
}
