package ch03_1_operator_expression;

import java.util.Scanner;

public class Ȯ�ι���9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstData = scanner.nextDouble();
		System.out.println("ù��° �� = " + firstData);

		double secondData = scanner.nextDouble();
		System.out.println("�ι�° �� = " + secondData);
		System.out.println("=====================");

		while (secondData == 0 || secondData == 0.0) {
			System.out.println("��� �� = ���Ѵ�");
			break;
		}
		System.out.println("��� �� = " + firstData / secondData);
	}
}
