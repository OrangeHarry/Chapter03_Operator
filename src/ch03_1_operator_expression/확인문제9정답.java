package ch03_1_operator_expression;

import java.util.Scanner;

public class Ȯ�ι���9���� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ù��° �� = ");
		double firstData = Double.parseDouble(scanner.nextLine());//���ڿ��� ���ڷ� �ٲ�°�

		System.out.println("ù��° �� = ");
		double SecondData = Double.parseDouble(scanner.nextLine());

		System.out.println("=======================");
		if (SecondData != 0.0) {
			System.out.println("��� = " + firstData / SecondData);
		} else {
			System.out.println("��� = ���Ѵ�");
		}
	}
}