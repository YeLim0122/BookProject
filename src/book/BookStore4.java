package book;

import java.util.*;
/**
 * novel, essay, poem 리스트 객체를 생성하여
 * 값을 저장하고, 출력하고, 검색 및 삭제하는 어플을 구현한 프로그램
 * 
 * @author YeLim Min
 */
public class BookStore4 {
	Scanner scan = new Scanner(System.in);
	
	Book n = new Novel();
	Book e = new Essay();
	Book poem = new Poem();
	
	static int count = 0;
	
	static ArrayList<Book> bookList = new ArrayList<>();
	
	/** 메뉴 선택을 위한 번호를 출력하는 메소드*/
	public void menu() {	
		System.out.println("-----BookStore App-----");
		System.out.println("1. 책 정보 등록");
		System.out.println("2. 책 정보 출력");
		System.out.println("3. 책 정보 검색");
		System.out.println("4. 책 정보 삭제");
		System.out.println("9. 종료");
		System.out.println("-----------------------");
		System.out.println("메뉴 번호를 선택하세요 => ");
		System.out.println("-----------------------");
		
	}
	
	/** 초기 메뉴 1번, 책 정보 등록 선택 시 나타나는 서브메뉴 번호를 출력하는 메소드 */
	public void menu_1() {		
		System.out.println("--------등록 메뉴---------");
		System.out.println("1. 소설 정보 등록");
		System.out.println("2. 에세이 정보 등록");
		System.out.println("3. 시집 정보 등록");
		System.out.println("4. 상위 메뉴로");
		System.out.println("-----------------------");
		System.out.println("번호를 선택하세요 => ");
		System.out.println("-----------------------");
	}
	
	/** 
	 * Novel 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 
	 * 
	 * @throws WrongIdException 
	 * 			소설 장르의 id는 100번대로, 100번대 이외의 id 입력 시 사용자 정의 예외 발생
	 */
	public void registerNovel() throws WrongIdException {	
		
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		n.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		n.setAuthor(a);
		
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		if (i < 100 || i > 199) {
			throw new WrongIdException("잘못된 id입니다. 소설의 id는 100번대입니다.");
		}
		else {
			n.setId(i);
		}
		scan.nextLine();
		
		System.out.println("장르 입력: ");
		String g = scan.nextLine();
		((Novel)n).setGenre(g);
		System.out.println("가격 입력: ");
		int p = scan.nextInt();
		((Novel)n).setPrice(p);
		
		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
		int save = scan.nextInt();
		if (save == 1) {
			bookList.add(n);
			count++;
			System.out.println("등록 완료! "+count+"개 저장");
		}	
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	/** 
	 * Essay 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 
	 * 
	 * @throws WrongIdException 
	 * 			에세이 장르의 id는 200번대로, 200번대 이외의 id 입력 시 사용자 정의 예외 발생
	 */
	public void registerEssay() throws WrongIdException {	
		
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		e.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		e.setAuthor(a);
		
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		if (i < 200 || i > 299) {
			throw new WrongIdException("잘못된 id입니다. 에세이의 id는 200번대입니다.");
		}
		else {
			e.setId(i);
		}
		scan.nextLine();
		
		System.out.println("장르 입력: ");
		String g = scan.nextLine();
		((Essay)e).setGenre(g);
		System.out.println("가격 입력: ");
		int p = scan.nextInt();
		((Essay)e).setPrice(p);
		
		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
		int save = scan.nextInt();
		if (save == 1) {
			bookList.add(e);
			count++;
			System.out.println("등록 완료! "+count+"개 저장");
		}	
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	/** 
	 * Poem 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 
	 * 
	 * @throws WrongIdException 
	 *			시집 장르의 id는 300번대로, 300번대 이외의 id 입력 시 사용자 정의 예외 발생
	 */
	public void registerPoem() throws WrongIdException {	
		
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		poem.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		poem.setAuthor(a);
		
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		if (i < 300 || i > 399) {
			throw new WrongIdException("잘못된 id입니다. 시집의 id는 300번대입니다.");
		}
		else {
			poem.setId(i);
		}
		scan.nextLine();
		
		System.out.println("장르 입력: ");
		String g = scan.nextLine();
		((Poem)poem).setGenre(g);
		System.out.println("가격 입력: ");
		int p = scan.nextInt();
		((Poem)poem).setPrice(p);
		
		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
		int save = scan.nextInt();
		if (save == 1) {
			bookList.add(poem);
			count++;
			System.out.println("등록 완료! "+count+"개 저장");
		}	
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	
	/** 
	 * 초기 메뉴 2번, 책 정보 출력 선택 시 모든 정보를 출력하는 메소드
	 * instanceof를 이용하여, novel, essay, poem 각 정보의 타이틀을 붙여 출력 
	 */
	public void printAll() {	
		for(Book b:bookList) {
			if(b instanceof Novel) {
				System.out.println("*** 소설 정보 *********");
				System.out.println(((Novel)b).printInfo());
			}
			else if(b instanceof Essay) {
				System.out.println("*** 에세이 정보 **********");
				System.out.println(((Essay)b).printInfo());
			}
			else if(b instanceof Poem) {
				System.out.println("*** 시집 정보 **********");
				System.out.println(((Poem)b).printInfo());
			}
		}
	}

	
	/** 초기 메뉴 3번, 책 정보 검색 선택 시 책 제목을 검색하여 정보를 출력하는 메소드 */	
	public void search() {
		System.out.println("검색할 책의 제목을 입력하세요: ");
		scan.nextLine();
		String sc = scan.nextLine();
		int num = 0;

		for(int i=0; i<bookList.size(); i++) {
			if (sc.equals(bookList.get(i).getTitle())){
				if (bookList.get(i).getId() >= 100 && bookList.get(i).getId() < 200) {
					System.out.println("*** 소설 정보 *********");
					System.out.println(bookList.get(i).printInfo());
				}
				else if(bookList.get(i).getId() >= 200 && bookList.get(i).getId() < 300) {
					System.out.println("*** 에세이 정보 **********");
					System.out.println(bookList.get(i).printInfo());
				}
				else if(bookList.get(i).getId() >= 300 && bookList.get(i).getId() < 400) {
					System.out.println("*** 시집 정보 **********");
					System.out.println(bookList.get(i).printInfo());
				}
				
				num = 1;
			}
		}
		if (num == 0) {
			System.out.println(sc+" 제목의 책은 존재하지 않습니다.");
		}
			
	}
	
	
	/** 초기 메뉴 4번, 책 정보 삭제 선택 시 책 제목을 입력 받아 해당 정보를 삭제하는 메소드 */
	public void delete() {
		System.out.println("삭제할 책의 제목을 입력하세요: ");
		scan.nextLine();
		
		String del = scan.nextLine();
		int num = 0;
		
		for(int i=0; i<bookList.size(); i++) {
			if(del.equals(bookList.get(i).getTitle())) {
				bookList.remove(i);
				System.out.println(del+" 제목의 책 정보를 삭제하였습니다.");
				num = 1;
			}
		}
		if (num==0) {
			System.out.println(del+" 제목의 책은 존재하지 않습니다.");
		}
		
	}

	
	
	/** 
	 * 메인 메소드
	 * BookStore 객체를 생성하여, switch-case문을 활용하여 각 메뉴 번호에 따른 메소드를 호출하여 실행한다.
	 */
	public static void main(String[] args) {
		
		while(true) {
			BookStore4 bs = new BookStore4();
			
			bs.menu();
			int num = bs.scan.nextInt();
			
			if(num == 9) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
			if(num<1 || num>4) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			switch (num) {
			case 1:			
				bs.menu_1();
				int menu1no = bs.scan.nextInt();
				bs.scan.nextLine();
				
				switch(menu1no) {
				case 1: 	
					try {
						bs.registerNovel();
					}
					catch (WrongIdException e) {
						String msg = e.getMessage();
						System.out.println(msg);
						System.out.println();
					}
					break;
					
				case 2:		
					try {
						bs.registerEssay();
					}
					catch (WrongIdException e) {
						String msg = e.getMessage();
						System.out.println(msg);
						System.out.println();
					}
					break;
				
				case 3:	
					try {
						bs.registerPoem();
					}
					catch (WrongIdException e) {
						String msg = e.getMessage();
						System.out.println(msg);
						System.out.println();
					}
					break;
				
				case 4: 	
					bs.menu();
					break;
				}
				break;
			
			case 2:
				bs.printAll();
				break;
			
			case 3:
				bs.search();
				break;
				
			case 4:
				bs.delete();
				break;
		
			}
			
		}
		

	}

}
