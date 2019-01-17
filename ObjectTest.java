package game_project;

//Object�� toString() �������̵�

class Book{
	private int price;
	private String title;
	
	public Book() {}
	public Book(String title, int price) {
		setTitle(title);
		setPrice(price);
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	
	@Override
	public String toString() { //�������̵� ����δ� ��ġ�� �ʴ´�.
		return getTitle() + " : " + getPrice();
	}
	
}


public class ObjectTest {

	public static void main(String[] args) {
		Book b1 = new Book("�ư���", 8600);
		Book b2 = new Book("�����ż���", 12000);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
	}

}
