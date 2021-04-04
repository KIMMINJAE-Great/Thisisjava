package sec05.exam04_function;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;

	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	// 4행에서 6행까지 필드의 값이 private로 되어있기에 외부에서 부를수 있게 getter를 추가한다.
	// 메뉴바 source -> generate getters and setters -> select getters
	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}
