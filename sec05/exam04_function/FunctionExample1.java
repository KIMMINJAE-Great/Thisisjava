package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList( // 컬렉션을 만들다 컬렉션이란 객체를 묶어놓은 객체
			new Student("Hongildong", 90, 96), 
			new Student("leebangwon", 95, 93)
			);
	// asList는 두개의 Student객체를 가질수 있는 컬렉션인 List<Student>를 만들어서 리턴한다.

	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student)+ " ");
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student)+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("[Student Name]");
		
		printString(t -> t.getName()); //t -> {return t.getName();}); 省略バージョン
		
		System.out.println("[English Score]");
		printInt(t -> t.getEnglishScore());  //구현객체를 람다식으로
	
		System.out.println("[Math Score]");
		printInt(t -> {return t.getMathScore();});
	}

}
