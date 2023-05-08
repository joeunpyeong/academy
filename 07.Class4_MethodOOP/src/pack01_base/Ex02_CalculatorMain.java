package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		//멤버 : 클래스를 인스턴스화 하고   .<-찍으면 나오는 것들
		
		Ex02_Calculator ec=new Ex02_Calculator();
		ec.powerOn(10);
		ec.powerOff();
		
		int result = ec.test()+10;//int타입을 무조건 return함==>int형 변수랑 같이 취급
		System.out.println(result);
		//String inputData = sc.nextLine();//<=
		
		System.out.println(ec.plus(110, 1));
		int sum= ec.plus3(5, 4, 2);
		System.out.println("합 :"+sum);
		System.out.println("평균 :"+sum/3);;
	}
}
