package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList( // 컬렉션을 만들다 컬렉션이란 객체를 묶어놓은 객체
			new Student("Hongildong", 90, 96), 
			new Student("leebangwon", 95, 93)
			);
	// asList는 두개의 Student객체를 가질수 있는 컬렉션인 List<Student>를 만들어서 리턴한다.
	public static double avg(ToIntFunction<Student> function) { //리턴되는 int에 대한 평균을 구할거에유
		 int sum = 0;
		 for(Student student : list) {
			 sum += function.applyAsInt(student);
		 }
		 double avg = (double)sum/list.size();
		 return avg;
	}
	
	
	public static void main(String[] args) {
	double englishAvg = avg( t -> t.getEnglishScore());
	System.out.println("English Avg : "+englishAvg);
	
	double mathAvg = avg( t -> t.getMathScore());
	System.out.println("Math Avg : "+mathAvg);
	}	

}
