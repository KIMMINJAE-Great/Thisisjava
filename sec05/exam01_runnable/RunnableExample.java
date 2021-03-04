package sec05.exam01_runnable;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> { // Runnable 에 있는 메소드 run이 매개변수가 없으니 () 만
			for (int i = 0; i < 10; i++) {
				System.out.println(i); // 스레드 스타트 이 내용 실행
			}
		};

		/*
		 * Thread thread = new Thread(runnable); 
		 * thread.start();
		 */

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) { // <<----가장 좋을 방식
				System.out.println(i);
			}
		});                                // 익명구현객체니깐 ); 까먹지말기
		thread.start();
	}

}
