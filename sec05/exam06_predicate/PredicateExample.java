package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("田中","男性",90),
			new Student("中村","男性",87),
			new Student("西村","女性",95),
			new Student("カンナ","女性",80)

			);
	public static double avg(Predicate<Student> predicate) {
		/*매개변수로 predicate를 준다는 것은 성 별로 평균을 구하려고 할때 
		남자일 경우에만 true 가 나오게 해서 각 성 별로 총합을 구할 수가 있게 된다.*/
		int count = 0, sum = 0; //같은 타입  int를 사용하니 콤마로만 작성함
		for(Student student : list) {
			if(predicate.test(student)) {
				count ++;
				sum += student.getScore();
			}
		}
		
		return (double)sum/count;
		
	}
	
	public static void main(String[] args) {
		//남자평균 먼저 얻기
		double maleAvg = avg(t -> t.getSex().equals("男性"));
		
		System.out.println("男性平均点数 : " + maleAvg);
		
		//女子평균 먼저 얻기
		double femaleAvg = avg(t -> t.getSex().equals("女性"));
				
		System.out.println("女性平均点数 　: " + femaleAvg);
	}

}
