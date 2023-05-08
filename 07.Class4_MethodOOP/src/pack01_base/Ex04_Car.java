package pack01_base;

public class Ex04_Car {
	//해당하는 Car클래스는 속성 gas를 가진다.
	//gas는 숫자형태로속성이 관리가 된다.(1. Ex04_Car는 gas를 무조건 입력받아야지만 생성이 가능한 클래스이다.)
	
	//isLeftGas라는 메소드를 구현하기
	//해당하는메소드는 true또는 false의 결과만 리턴하는 메소드
	//true,false의 판단은 gas가 0인 경우 false와 gas가 없습니다 라는 메세지가 출력
	//그게 아니라면 true와 gas가 있습니다 라는 메세지 출력
	
	//Ex04_CarMain을 만들고 모든 멤버에 접근해서 호출 및 사용해보기
	int gas;

	
	public Ex04_Car(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");

			return false;
		}else {
			System.out.println("가스가 있습니다.");

			return true;
		}
	}
	
}
