package pack01_Variable;

public class Test01_Variable {
// int num1 , int num2
// 각각의 변수에는 숫자 1과 2가 담아져있음
// 값의 재할당 x , 두개의 숫자를 바꿔보기
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num0 = 0;
		
		num0 = num1;
		num1 = num2;
		num2 = num0;
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
