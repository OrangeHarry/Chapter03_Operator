package ch03_1_operator_expression;

public class OperatorExpression {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println(result1);
		System.out.println(result2);
	}
}
