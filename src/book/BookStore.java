package book;

import java.util.*;
/**
 * novel, essay, poem 리스트 객체 생성하여
 * 값을 저장하고, 출력하고, 검색 및 삭제하는 어플을 구현한 프로그램
 */
public class BookStore {
	Scanner scan = new Scanner(System.in);
	
	Book n = new Novel();
	Book e = new Essay();
	Book p = new Poem();
	
	int countN = 0;
	
	ArrayList<Book> novelList = new ArrayList<>();
	ArrayList<Essay> essayList = new ArrayList<>();
	ArrayList<Poem> poemList = new ArrayList<>();
	ArrayList<Book> bookList = new ArrayList<>();
	
	
	/** 메뉴 선택 메소드*/
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
	
	/** 책 정보 등록 선택 시 나타나는 서브메뉴 메소드 */
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
	
	/** Novel 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 */
	public void registerNovel() {	
		//Novel n1 = new Novel();
		
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		n.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		n.setAuthor(a);
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		n.setId(i);
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
			novelList.add(n);
			countN++;
			System.out.println("등록 완료! "+countN+"개 저장");
			
		}	
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	/** Essay 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 */
	public void registerEssay() {
		Essay e1 = new Essay();
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		e1.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		e1.setAuthor(a);
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		e1.setId(i);
		scan.nextLine();
		System.out.println("장르 입력: ");
		String g = scan.nextLine();
		e1.setGenre(g);
		System.out.println("가격 입력: ");
		int p = scan.nextInt();
		e1.setPrice(p);
		
		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
		int save = scan.nextInt();
		if (save == 1) {
			essayList.add(e1);
			System.out.println("등록 완료!");
		}
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	/** Poem 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 */
	public void registerPoem() {	
		Poem p1 = new Poem();
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		p1.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		p1.setAuthor(a);
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		p1.setId(i);
		scan.nextLine();
		System.out.println("장르 입력: ");
		String g = scan.nextLine();
		p1.setGenre(g);
		System.out.println("가격 입력: ");
		int p = scan.nextInt();
		p1.setPrice(p);
		
		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
		int save = scan.nextInt();
		if (save == 1) {
			poemList.add(p1);
			System.out.println("등록 완료!");
		}
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	/** 2번 책 정보 출력 선택 시 모든 정보 출력되는 메소드 */
	public void printAll() {	
		if(novelList instanceof ArrayList) {
			System.out.println("*** 소설 정보 **********");
			System.out.println(novelList.size());
			System.out.println(bookList.size());
			
			Iterator<Book> itn = novelList.iterator();
			
			while (itn.hasNext()) {
				Book bn = itn.next();
				System.out.println(((Novel)bn).printInfo());
			}
			
			
		}
//		for(Novel n:novelList) {
//			System.out.println(n.printInfo());
//		}
//		System.out.println();
		
//		if(essayList instanceof ArrayList) {
//			System.out.println("*** 에세이 정보 **********");
//			for(Essay e:essayList) {
//				System.out.println(e.printInfo());
//			}
//			System.out.println();
//		}
//		if(poemList instanceof ArrayList) {
//			System.out.println("*** 시집 정보 **********");
//			for(Poem p:poemList) {
//				System.out.println(p.printInfo());
//			}
//			System.out.println();
//		}
	}
	

	public static void main(String[] args) {
		
		while(true) {
			BookStore bs = new BookStore();
			
			//ArrayList<Novel> novelList = new ArrayList<>();
			
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
					bs.registerNovel();
					
					bs.printAll();
					break;
					
				case 2:		
					bs.registerEssay();
					break;
				
				case 3:		
					bs.registerPoem();
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
				
				break;
				
			case 4:
				
				break;
		
			}
			
		}
		

	}

}
