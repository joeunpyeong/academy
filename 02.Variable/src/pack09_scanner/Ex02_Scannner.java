package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scannner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //기억이 안나면 복붙해도 됌  , 쩔수 없음
		System.out.println("숫자를 입력");
		String data1 = sc.nextLine(); //내가 엔터키 치기전까지의 문자열을 가져옴
		//숫자를 두개 받아와서 두 수의 합을 구하기
		//---중요 x, 공부하기위해서 어쩔 수 없이 외워서 쓰고있음---//3
		System.out.println("num1 입력 값 :"+data1);
		String data2 = sc.nextLine();
		
		System.out.println("num2 입력 값 :"+data2);
		//int num1 = Integer.parseInt(data1);
		//int num2 = Integer.parseInt(data2);
		System.out.print("num1 + num2 =");
		//System.out.println(num1+num2);
		int num = (Integer.parseInt(data1)) + (Integer.parseInt(data2));
		System.out.println(num);
		
		
	}
}
