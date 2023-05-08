package pack02_static;

import java.util.Scanner;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num 1:");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("num 2:");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println(Ex02_Calculator.plus(num1, num2));
		System.out.println(Ex02_Calculator.minus(num1, num2));
		System.out.println(Ex02_Calculator.mul(num1, num2));
		System.out.println(Ex02_Calculator.div(num1, num2));
		

	}
}
