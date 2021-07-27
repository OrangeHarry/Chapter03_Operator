package ch03_1_operator_expression;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.printf("result1 = %s\n", result1);
		System.out.printf("result1 = %b\n", num1 == num2);
		System.out.printf("result2 = %s\n", result2);
		System.out.printf("result2 = %b\n", num1 != num2);
		System.out.printf("result3 = %s\n", result3);
		System.out.printf("result3 = %b\n", num1 <= num2);

		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		boolean result4 = (char1 < char2);
		System.out.printf("result4 = %s\n", result4);
		System.out.printf("result4 = %b\n", char1 < char2);
	}
}
