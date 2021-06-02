package sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		// System.out.println(t + "8");<- t를 출력하는 소비코드
		// 타입파라미터로 String 주겠습니다. 이말은 결국 매개값으로 String을 받아서 소비하는 consumer를 쓰겠다는 얘기

		consumer.accept("java");// 함수적인터페이스 내의 추상메소드를 실행 시킨다.

		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("java", "8");

		
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
	}

}
