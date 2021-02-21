package sec04.exam02_localVariable;

public class UsingLocalVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			UsingLocalVariable ulv = new UsingLocalVariable();
			ulv.method(20);  //arg에 20을 대입시키고 메소드를 실행시킨다.  
			
	}

}


/*정리 
 * 람다식에서 매개변수나 로컬변수를 사용하게되면 이들 로컨변수들은 final특성을 갖기 때문에 변경을 할 수가 없다    */
 