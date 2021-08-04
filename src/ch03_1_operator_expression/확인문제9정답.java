package ch03_1_operator_expression;

import java.util.Scanner;

public class 확인문제9정답 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 수 = ");
		double firstData = Double.parseDouble(scanner.nextLine());//문자열이 숫자로 바뀌는거

		System.out.println("첫번째 수 = ");
		double SecondData = Double.parseDouble(scanner.nextLine());

		System.out.println("=======================");
		if (SecondData != 0.0) {
			System.out.println("결과 = " + firstData / SecondData);
		} else {
			System.out.println("결과 = 무한대");
		}
	}
}