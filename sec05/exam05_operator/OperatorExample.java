package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;

	}

	public static void main(String[] args) {
		// 最大値を取る
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		// operator에 applyAsInt의 내용이 (21행 부터 24행)들어간다.
		// result와 score둘중의 큰값을 리턴하도록 만들었다.
		System.out.println("最大値" + max);

		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;

		});
		System.out.println("最小値" + min);
	}

}
