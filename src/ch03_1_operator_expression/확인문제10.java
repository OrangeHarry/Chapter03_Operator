package ch03_1_operator_expression;

public class 확인문제10 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이 = " + var4);
	}
}
//원의 넓이 =(반지름)×(반지름)×(원주율) 10*10*3.14