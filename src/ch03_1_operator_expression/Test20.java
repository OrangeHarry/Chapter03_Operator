package ch03_1_operator_expression;

public class Test20 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
//      num1 += 10
//		num1 = num1 + 10 //위에꺼랑 같은거
		
		result = ((num1 += 10) < 0 && (num2 += 10) > 0); //앞에가 false니깐 뒤에꺼 계산을 안하고 넘어간다. 
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);

//		현재 num1 = 10, num2 =0 
		result = ((num1 += 10) > 0 || (num2 += 10) > 0); // 앞에가 true니깐 뒤에꺼 계산을 안하고 넘어간다.
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
	}
}
