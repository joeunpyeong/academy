package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		int data1=10;
		int data2=1;

		Scanner sc=new Scanner(System.in);//스캐너 < = 오류 안나게 바꾸는 작업을 하기
		sc.nextLine();
		//catch블럭을 내가 알고있는 예외종류로 하나더 연결하고 catch블럭이 실행되게 해보기

		try {
			int result = data1/data2;//ArithmeticException
			args[10]="1";
		} catch (ArithmeticException e) {//연산오류 0으로 어떤 수 나누기 하면 발생
			int data3=100;
			System.out.println("data2의 변수(값:"+data2+")때문에 오류"+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException"+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류!!"+e.getMessage());
		}
	}
}
