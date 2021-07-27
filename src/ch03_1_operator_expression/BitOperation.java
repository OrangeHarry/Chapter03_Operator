package ch03_1_operator_expression;

public class BitOperation {
	public static void main(String[] args) {
		
		/*
		 * ��Ʈ������( |, &, ^, ~, <<, >> )
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
//a,b�� &����   1001 -> 9 
//           �Ѵ� 1�ΰ��� ù��° �׹�° �ڸ� �ٲ� ����.
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b)); // �� bit������ ������

		System.out.println("10���� &���� = " + (a & b));
		System.out.println("10���� |���� = " + (a | b));
		
		System.out.println("3<<2 = " + (3 << 2)); //3�̶�� ������ bit�� �������� ��ĭ �Űܶ� (0011 -> 1100)
		System.out.println(1<<7);
		System.out.println(128>>5);
	}
}