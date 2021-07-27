package ch03_1_operator_expression;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 61;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // 80점이 넘으면 B, 80점이 넘지 않으면 C야
//		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : ((score > 70) ? 'C' : 'D'); //이야 이런식으로 하면 끝도 없이 갈 수 있구나
//		System.out.println(score + "점은 " + grade + "등급입니다.");
//		System.out.printf("%d점은 %c등급입니다.", score, grade);

		char grade;
		if (score > 90) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 90) {
			grade = 'C';
		} else if (score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("your grade is " + grade); // 위에 꺼랑 같다고 보면된다.
	}
}
