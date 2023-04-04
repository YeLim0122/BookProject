package book;

import java.util.*;
/**
 * novel, essay, poem 리스트 객체 생성하여
 * 값을 저장하고, 출력하고, 검색 및 삭제하는 어플을 구현한 프로그램
 */
public class BookStore2 {
	Scanner scan = new Scanner(System.in);
	
	Book n = new Novel();
	Book e = new Essay();
	Book p = new Poem();
	
	int countN = 0;
	int countE = 0;
	int countP = 0;
	
	Book[] novelarr = new Book[countN+1];
	Book[] essayarr = new Book[3];
	Book[] poemarr = new Book[3];

	
	/** 메뉴 선택 메소드*/
	public void menu() {	
		System.out.println("-----BookStore App2-----");
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
		Novel n1 = new Novel();
		
		System.out.println("제목 입력: ");
		String t = scan.nextLine();
		n1.setTitle(t);
		System.out.println("저자 입력: ");
		String a = scan.nextLine();
		n1.setAuthor(a);
		System.out.println("id 입력: ");
		int i = scan.nextInt();
		n1.setId(i);
		scan.nextLine();
		System.out.println("장르 입력: ");
		String g = scan.nextLine();
		n1.setGenre(g);
		System.out.println("가격 입력: ");
		int p = scan.nextInt();
		n1.setPrice(p);
		
		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
		int save = scan.nextInt();
		if (save == 1) {
			
			novelarr[countN] = n1;
			countN++;
			System.out.println("등록 완료! 현재 등록인원: "+countN+"명");
			Book[] novelarr = new Book[countN+1];
			System.out.println(novelarr.length);
			
		}
		else {
			System.out.println("등록을 취소하였습니다.");
		}
		System.out.println();
	}
	
	/** Essay 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 */
//	public void registerEssay() {
//		Essay e1 = new Essay();
//		System.out.println("제목 입력: ");
//		String t = scan.nextLine();
//		e1.setTitle(t);
//		System.out.println("저자 입력: ");
//		String a = scan.nextLine();
//		e1.setAuthor(a);
//		System.out.println("id 입력: ");
//		int i = scan.nextInt();
//		e1.setId(i);
//		scan.nextLine();
//		System.out.println("장르 입력: ");
//		String g = scan.nextLine();
//		e1.setGenre(g);
//		System.out.println("가격 입력: ");
//		int p = scan.nextInt();
//		e1.setPrice(p);
//		
//		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
//		int save = scan.nextInt();
//		if (save == 1) {
//			essayList.add(e1);
//			System.out.println("등록 완료!");
//		}
//		else {
//			System.out.println("등록을 취소하였습니다.");
//		}
//		System.out.println();
//	}
//	
//	/** Poem 정보를 입력받아 등록하여 ArrayList에 저장하는 메소드 */
//	public void registerPoem() {	
//		Poem p1 = new Poem();
//		System.out.println("제목 입력: ");
//		String t = scan.nextLine();
//		p1.setTitle(t);
//		System.out.println("저자 입력: ");
//		String a = scan.nextLine();
//		p1.setAuthor(a);
//		System.out.println("id 입력: ");
//		int i = scan.nextInt();
//		p1.setId(i);
//		scan.nextLine();
//		System.out.println("장르 입력: ");
//		String g = scan.nextLine();
//		p1.setGenre(g);
//		System.out.println("가격 입력: ");
//		int p = scan.nextInt();
//		p1.setPrice(p);
//		
//		System.out.println("등록한 정보를 저장할까요? [1. 예   2. 아니오]");
//		int save = scan.nextInt();
//		if (save == 1) {
//			poemList.add(p1);
//			System.out.println("등록 완료!");
//		}
//		else {
//			System.out.println("등록을 취소하였습니다.");
//		}
//		System.out.println();
//	}
	
	/** 2번 책 정보 출력 선택 시 모든 정보 출력되는 메소드 */
	public void printAll() {	
		//Object arr[] = {novelarr, essayarr, poemarr};
		
//		if (n instanceof Book) {
//			System.out.println(novelarr.length);
//			for(int j=0; j<novelarr.length; j++) {
//				System.out.println(novelarr[j]);
//			}
//		}
		
		if (n instanceof Book) {
			System.out.println("***소설 정보**********");
			for(int j=0; j<novelarr.length; j++) {
				System.out.println(novelarr[j].printInfo());
			}
		}
		
//		for(Book b:novelarr) {
//			if(b instanceof Novel) {
//				System.out.println(b.printInfo());
//			}
//		} => 안나옴
		
//			for(int j=0; j<novelarr.length; j++) {
//				System.out.println(novelarr[j].printInfo());
//				System.out.println();
//			}
		
	}


	public static void main(String[] args) {
		BookStore2 bs = new BookStore2();
		
		for(int x=0; x<bs.novelarr.length; x++) {
			bs.novelarr[x] = new Novel();
		}
		
		while(true) {
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
					
					//bs.printAll();
					break;
					
				case 2:		
					//bs.registerEssay();
					break;
				
				case 3:		
					//bs.registerPoem();
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
