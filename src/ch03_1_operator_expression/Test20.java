package ch03_1_operator_expression;

public class Test20 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
//      num1 += 10
//		num1 = num1 + 10 //�������� ������
		
		result = ((num1 += 10) < 0 && (num2 += 10) > 0); //�տ��� false�ϱ� �ڿ��� ����� ���ϰ� �Ѿ��. 
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);

//		���� num1 = 10, num2 =0 
		result = ((num1 += 10) > 0 || (num2 += 10) > 0); // �տ��� true�ϱ� �ڿ��� ����� ���ϰ� �Ѿ��.
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
	}
}
