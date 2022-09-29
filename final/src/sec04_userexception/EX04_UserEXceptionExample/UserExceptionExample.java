package sec04_userexception.EX04_UserEXceptionExample;

class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	pubic OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class A {
	void checkScroe(int score) throws MinusException, OverException {
		if(score < 0) {
			throw new MinusException("예외 발생: 음숫값 입력");
		}
		else if (score > 100)
			throw new OverException("예외 발생: 100점 초과");
		else
			System.out.println("정상적인 값입니다.");
	}
}
public class UserExceptionExample {
	public static void main(String[] args) {

		A a = new A();
		try {
			a.checkScroe(85);
			a.checkScroe(150);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
