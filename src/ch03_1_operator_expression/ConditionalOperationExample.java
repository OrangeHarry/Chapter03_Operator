package ch03_1_operator_expression;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 61;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // 80���� ������ B, 80���� ���� ������ C��
//		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : ((score > 70) ? 'C' : 'D'); //�̾� �̷������� �ϸ� ���� ���� �� �� �ֱ���
//		System.out.println(score + "���� " + grade + "����Դϴ�.");
//		System.out.printf("%d���� %c����Դϴ�.", score, grade);

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
		System.out.println("your grade is " + grade); // ���� ���� ���ٰ� ����ȴ�.
	}
}
