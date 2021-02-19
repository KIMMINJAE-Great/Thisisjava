package sec03.exam03_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {

		MyFunctionalInterface fi; /**/

		fi = (x, y) ->{
			
			int result = x +y;
			
			return result;
			};
	System.out.println(fi.method(5,4));
	
	fi = (x,y) ->  x+y;
	System.out.println(fi.method(4,6));
	
	
	fi = (x, y) -> sum(x, y);
	System.out.println(fi.method(1,2));
	
	
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}
