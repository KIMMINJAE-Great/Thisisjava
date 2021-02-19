package chap3;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi; /* 변수를 선언 한다. */

		fi = () -> {
			String str = "method call1";

			System.out.println(str);
		};
		/*
		 * MyFunctionalInterface라는 인터페이스의 익명구현객체를 만들었다 MyFunctionalInterface라는 인터페이스는
		 * 매개변수가 없기에 ()작성 그리고 위는 실행문이 2개 이기에 중괄호는 필수
		 * 
		 */

		fi.method(); // 이를 실행하면 람다식으로 만든 13행을 출력한다.

		fi = () -> {
			System.out.println("method call2");
		};

		/*
		 * fi = () -> System.out.println("method call2"); 실행문이 하나 이기에 중괄호를 생략
		 */

		fi.method();

	}

	/*
	 * 1 인터페이스 변수 선언 2 람다식으로 익명구현객체 생성 3 변수에 있는 메소드를 실행
	 */

}
