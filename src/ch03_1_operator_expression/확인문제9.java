package ch03_1_operator_expression;

import java.util.Scanner;

public class 확인문제9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstData = scanner.nextDouble();
		System.out.println("첫번째 수 = " + firstData);

		double secondData = scanner.nextDouble();
		System.out.println("두번째 수 = " + secondData);
		System.out.println("=====================");

		while (secondData == 0 || secondData == 0.0) {
			System.out.println("결과 값 = 무한대");
			break;
		}
		System.out.println("결과 값 = " + firstData / secondData);
	}
}
