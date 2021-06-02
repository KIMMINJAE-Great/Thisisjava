package sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6) + 1;//주사위 눈 구하는  api?
			return num;
		};

		int num = intSupplier.getAsInt(); // <-이 메소드가 실행되면 8에서 11행을 실행한다.
		
		System.out.println("눈의 수 : "+ num);

	}

}
