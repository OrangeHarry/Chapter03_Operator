package ch03_1_operator_expression;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("-----------------------");
		x++; //11
		++x; //여기선 위에 결과 때문에 x자체가 11이니깐
		System.out.println("x = " + x); //12가 나온다.

		System.out.println("-----------------------");
		y--; // 9
		--y; // 8
		System.out.println("y = " + y);

		System.out.println("-----------------------");
		z = x++; //현재 x값 12
		System.out.println("z = " + z); //z값은 아직 연산을 하지 않은 상태(12(x)++) 
		System.out.println("x = " + x); //x는 연산 완료이니 이제 13

		System.out.println("-----------------------");
		z = ++x; // x값 13
		System.out.println("z = " + z); //++는 먼저 계산을 하는 거니 z값은 현재 14이다.
		System.out.println("x = " + x); // x도 14징

		System.out.println("-----------------------");
		z = ++x + y++; //x값은 14, y값은 8 
		System.out.println("z = " + z); // 15 + 8++ = 23++ 여기서는 이걸로 끝
		System.out.println("x = " + x); // 15
		System.out.println("y = " + y); // 8++ 값이니깐 = 9
	}
}
