package sec04.exam01_filed;

public class UsingThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner(); //중첩클래스의 객체생성
		inner.method();
	}

}
