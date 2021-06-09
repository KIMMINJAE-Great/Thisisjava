package sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA : "+ m.getName());
		};
		//Consumer는 매개값으로 Member를 받아서 단순히 소비만 하는 함수적인터페이스
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB : "+ m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("キム","KIM",null));
	}
		/*andThen은 consumerA가 아닌 다른 함수적인터페이스를 사용하였을때
		 * 리턴값이 있다면 A함수적인터페이스의 리턴값이 B함수적인터페이스의 매개값으로 리턴된다
		 * 그러나 consumer함수적인터페이스는 리턴값이 없기때문에 andThen은 
		 * 단순히 순서만 결정하게 된다.*/
}
