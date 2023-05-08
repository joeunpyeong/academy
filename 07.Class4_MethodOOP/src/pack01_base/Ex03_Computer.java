package pack01_base;

public class Ex03_Computer {
	//Ex03_Computer에 메소드를 구현하기
	//sum1이라는 메소드를 만듬
	//해당하는 메소드는 숫자형을 묶어놓은 배열을 입력받아 배열의 총합을 구현하는 메소드이다.
	//총합을 구하고나서 결과를 메소드 호출부로 반환(return)하는 기능을 구현해보기.
	
	//Ex03_ComputerMain에서 호출해서 사용해보기
	
	int sum1(int arr[]) {
		int sum=0;
		
		for(int i=0; i<arr.length ;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
	//많이 안쓰는 형태의 메소드 파라멩터
	int sum2(int...values) {
		int sum = 0;
		for(int i=0 ; i<values.length;i++) {
			sum+=i;
		}
		return sum;
	}
	
	
	
}
