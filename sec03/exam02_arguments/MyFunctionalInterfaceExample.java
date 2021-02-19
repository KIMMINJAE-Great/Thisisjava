package sec03.exam02_arguments;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {

		MyFunctionalInterface fi; /**/

		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};

		fi.method(5);

		
		
		fi = x -> System.out.println(x * 5);   /*매개변수도 하나 실행문도 하나 ()와 {}를 생략*/
		fi.method(5);
	}
}