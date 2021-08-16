package ch03_1_operator_expression;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;

		int result1 = v1 + v2;
		System.out.println("result1 = " + result1); // 5+2

		int result2 = v1 - v2;
		System.out.println("result2 = " + result2); // 5-2

		int result3 = v1 * v2;
		System.out.printf("result3 = %d\n", result3); // 5*2

		int result4 = v1 / v2;
		System.out.printf("result4 = %d\n", result4); // 5/2

		int result5 = v1 % v2;
		System.out.printf("result5 = %d\n", result5); // 나머지값

		double result6 = (double) v1 / v2;
		System.out.printf("result6 = %f\n", result6); // double은 실수라서 %s를 써야하나봐.... %d는 숫자, %s는 문자, %f는 실수 // %s쓰면 2.5가 딱나와..
	}
}
