package sec04.exam02_localVariable;

public class UsingLocalVariable {
	void method(int arg) {		//매개변수가 있는 메소드를 작성
		int localVar = 40;
		
		// arg = 31;하면 11행에서 에러 왜냐 arg는 final특성    그니깐 여기다가 값을 바꾸려하지말장
		// localVar을 다른 수로 바꿔도 똑같은 에러가 발생 고로 수정하면 안된다/. 
		
		 MyFunctionalInterface fi =() ->{
			 System.out.println("arg: "+arg);
			 System.out.println("localVar: " + localVar);
		 };
	fi.method();
	
	}
}
/*//public class UsingLocalVariable {
		void method(final int arg) {		 이렇게 int 앞에 final을 붙여줘도 되지만 이게 람다식에서 사용이 되면 묵시적으로 final로 컴파일러가 해석한다.
	  		 final int localVar = 40;*/