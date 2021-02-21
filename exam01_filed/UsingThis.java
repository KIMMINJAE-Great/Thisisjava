package sec04.exam01_filed;

public class UsingThis {

	public int outterField = 10; // 필드를 선언초기값은 10

	class Inner { // 중첩클래스를 작성한다

		int innerField = 20;

		void method() { // Inner 클래스안에 메소드를 하나 작성 그후 람다식을 이용한다

			MyFunctionalInterface fi = () -> { // 뭔가 MyFunctionalInterface가 fi타겟타입으로서 함수적인터페이스가 아니라고 문법에러?가 떳었는데 런 시키니
												// 에러가표시가 사라짐
				System.out.println("outterField:" + outterField);
				System.out.println("innerField:" + innerField);
			};// 익명구현객체 만들시 ; 까먹지 말기

			fi.method();

		}

	}
}

/*public class UsingThis {

	public int field = 10;

	class Inner
 * int field = 20;
 * 
 *	 void method() {
 * 
 *    MyFunctionalInterface fi = () -> { 
 *       System.out.println("outterField:"+field);
 *        System.out.println("innerField:"+field);
 *        
 *        이것을 출력하면 36행37행 모두 20이 나온다 여기서
 *        36행의 ouuterField를 10으로 나오게 하고 싶다면 바깥의 클래스의  인스턴스로 접근해야하며 
 *        36행은 System.out.println("outterField:"+ UsingThis.this.field) 를 하면 된다.
 *        
 *        만약 37행에 System.out.println("innerField:"+this.field); 하면 Inner클래스의 인스턴스인 field를 참조한다.
 */