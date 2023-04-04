package book;
import java.util.*;

/** 
 * 부모 클래스 Book
 * 제목을 저장하는 변수 title, 작가를 저장하는 변수 author
 * 추상클래스로, getId(), setId() 메소드를 추상 메소드로 갖는다.
 * 
 */

abstract public class Book {
	Scanner scan = new Scanner(System.in);
	
	private String title;
	private String author;
	
	abstract public int getId();
	abstract public void setId(int no);
	
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	public String getAuthor() {
		return author;
	}
	
	public void input() {
		System.out.println("제목 입력: ");
		title = scan.nextLine();
		System.out.println("저자 입력: ");
		author = scan.nextLine();
	}
	
	public String printInfo() {
		String info = "제목: "+title+"\n";
				info += "저자: "+author+"\n";
		return info;
		
	}

}
