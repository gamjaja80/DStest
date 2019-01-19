package review;

class Person{
	String name;
	int jumin;
	
	public Person() {}
	public Person(String name, int jumin) {
		this.name = name;
		this.jumin = jumin;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj instanceof Person) {
			if(this.jumin == ((Person)obj).jumin) {
				result = true;
			}
		}
		return result;
	}
}


class Dog{}



public class ObjectTest05 {

	public static void main(String[] args) {
		Person pcs = new Person("¹ÚÃ¶¼ö", 870824);
		Person ksm = new Person("±è¼º¹Î", 921103);
		Person pcm = new Person("¹ÚÃ¶¹Î", 870824);
		
		Dog dog = new Dog();
		
		System.out.println(pcs == ksm);
		System.out.println(pcs.equals(ksm));
		System.out.println(pcs.equals(pcm));
		System.out.println(pcs.equals(dog));

	}

}
