package ch03_1_operator_expression;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("-----------------------");
		x++; //11
		++x; //���⼱ ���� ��� ������ x��ü�� 11�̴ϱ�
		System.out.println("x = " + x); //12�� ���´�.

		System.out.println("-----------------------");
		y--; // 9
		--y; // 8
		System.out.println("y = " + y);

		System.out.println("-----------------------");
		z = x++; //���� x�� 12
		System.out.println("z = " + z); //z���� ���� ������ ���� ���� ����(12(x)++) 
		System.out.println("x = " + x); //x�� ���� �Ϸ��̴� ���� 13

		System.out.println("-----------------------");
		z = ++x; // x�� 13
		System.out.println("z = " + z); //++�� ���� ����� �ϴ� �Ŵ� z���� ���� 14�̴�.
		System.out.println("x = " + x); // x�� 14¡

		System.out.println("-----------------------");
		z = ++x + y++; //x���� 14, y���� 8 
		System.out.println("z = " + z); // 15 + 8++ = 23++ ���⼭�� �̰ɷ� ��
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 8++ ���̴ϱ� = 9
	}
}
