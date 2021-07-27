package ch03_1_operator_expression;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; //산술연산에 사용되면 int타입으로 변환되므로
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}
}
