package review;

class Outer{
	void print(int choice) {
		class Inner{
			void hp() {System.out.println("hp∑Œ ¿Œº‚");}
			void epson() {System.out.println("epson¿∏∑Œ ¿Œº‚");}
			void samsung() {System.out.println("samsung¿∏∑Œ ¿Œº‚");}
		}//Inner
			
		Inner in = new Inner();
		if(choice == 1) {in.hp();}
		else if(choice == 2) {in.epson();}
		else {in.samsung();}
	}//print()
}

public class InnerTest02 {

	public static void main(String[] args) {
		new Outer().print(2);
	}

}
