package ch03_1_operator_expression;

public class 지루해서 {
	public static void main(String[] args) throws InterruptedException {
		int count = 10;
		while (count != 0) {
			Thread.sleep(500);//0.5초
			System.out.println(count--);
		}
		System.out.println("fire!!");
	}
}
