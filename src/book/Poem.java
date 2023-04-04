package book;
/**
 * Book 클래스를 상속받는 자식 클래스 Poem
 * id를 저장하는 변수 id, 장르를 저장하는 변수 genre, 가격을 저장하는 변수 price
 * Book 클래스의 getId(), setId(), printInfo()를 오버라이딩
 */

public class Poem extends Book {
	
	private int id;
	private String genre;
	private int price;

	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int no) {
		id = no;
	}
	
	public void setGenre(String g) {
		genre = g;
	}
	public String getGenre() {
		return genre;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String printInfo() {
		return super.printInfo()+"id: "+id+"\n장르: "+genre+"\n가격: "+price+"\n";
	}
}
