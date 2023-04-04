package book;
/**
 * 사용자 정의 예외
 * Exception을 상속받음
 * novel은 100번대, essay는 200번대, poem은 300번대 아이디를 받아야 함.
 * 그렇지 않았을 경우 WrongIdException 발생
 */

public class WrongIdException extends Exception {
	
	public WrongIdException() {
		super("WrongIdException");
	}
	
	public WrongIdException(String msg) {
		super(msg);
	}

}
