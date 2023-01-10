
public class Main {

	public static void main(String[] args) {
		// system.out.println(args[0]);  <= sys 소문자이기 때문에 컴파일 에러 
		/*
		 * 자바 컴파일러
		 * 1. 구문체크
		 * 2. 번역
		 * 3. 최적화 
		 */
		// 위의 문장을 실행했다고 해도 ArrayindexOutof BoundsException 런타임 에러 발생함.
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		
		} catch(ArithmeticException e) {
			if(e instanceof ArithmeticException)
			System.out.println("true");
			System.out.println("ArithmeticException");
	
		} catch(Exception e) {
			System.out.println("Exception");
		} //try-catch의 끝
		
		System.out.println(6);

	} //End of Main

} //End of Class
