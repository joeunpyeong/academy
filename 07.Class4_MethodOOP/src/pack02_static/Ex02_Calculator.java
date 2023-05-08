package pack02_static;

public class Ex02_Calculator {
	//Ex02_CalculatorMain을 만들고 Ex02_Calculator에 있는 메소드를 전부 호출하는 것
	//Main클래스에서는 인스턴스화 과정이 없습니다.
	
	//메소드 기능은 다음과 같다.
	//plus <-두 수를 입력받아 합을 return하는 static메소드
	//minus(차)를 return하는 static메소드
	//mul(곱)을 return하는 static메소드
	//div(나)을 return하는 static메소드
	
	static int plus(int num1, int num2) {
		System.out.print(num1+"+"+num2+" = ");
		return num1+num2;
	}
	static int minus(int num1, int num2) {
		System.out.print(num1+"-"+num2+" = ");
		return num1-num2;
	}
	static int mul(int num1, int num2) {
		System.out.print(num1+"*"+num2+" = ");
		return num1*num2;
	}
	static int div(int num1, int num2) {
		System.out.print(num1+"/"+num2+" = ");
		return num1/num2;
	}
}
