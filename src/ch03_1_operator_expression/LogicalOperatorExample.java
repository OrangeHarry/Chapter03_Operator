package ch03_1_operator_expression;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("���� �빮�ڱ���");
		}
		if ((charCode >= 97) && (charCode <= 122)) { //�ξ� ȿ����
			System.out.println("���� �ҹ��ڱ���");
		}
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 ���ڱ���");
		}

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) { // %2==0 (2�ǹ��), %3==0(3�� ���)
			System.out.println("2 �Ǵ� 3�� �������");
		}
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ����α���");
		}
	}
}