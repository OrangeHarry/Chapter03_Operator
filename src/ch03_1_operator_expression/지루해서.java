package ch03_1_operator_expression;

public class �����ؼ� {
	public static void main(String[] args) throws InterruptedException {
		int count = 10;
		while (count != 0) {
			Thread.sleep(500);//0.5��
			System.out.println(count--);
		}
		System.out.println("fire!!");
	}
}
