package ch03_1_operator_expression;

public class BitOperation {
	public static void main(String[] args) {
		
		/*
		 * 비트연산자( |, &, ^, ~, <<, >> )
		 * 
		 * x   y      x | y      x & y      x ^ y
		 * *****************************************
		 * 1   1        1          1          0
		 * 1   0        1          0          1
		 * 0   1        1          0          1
		 * 0   0        0          0          0
		 * *****************************************
		 */

		int a = 9;
		int b = 11;

//	     	1001 -> 9
//		    1011 -> 11
//a,b를 &연산   1001 -> 9 
//           둘다 1인경우는 첫번째 네번째 자리 바께 없다.
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b)); // 오 bit값으로 나오네

		System.out.println("10진수 &연산 = " + (a & b));
		System.out.println("10진수 |연산 = " + (a | b));
		
		System.out.println("3<<2 = " + (3 << 2)); //3이라는 숫자의 bit를 왼쪽으로 두칸 옮겨라 (0011 -> 1100)
		System.out.println(1<<7);
		System.out.println(128>>5);
	}
}