package sec04_userexception.EX02_ExceptionMethod_1;

public class ExcetionMethod_1 {

	public static void main(String[] args) {
	
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new Exception("예외 메시지");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
