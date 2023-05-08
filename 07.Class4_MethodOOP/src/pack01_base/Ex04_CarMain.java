package pack01_base;

public class Ex04_CarMain {
	public static void main(String[] args) {
		Ex04_Car ec = new Ex04_Car(10);
		
		ec.isLeftGas();
	
	if(ec.isLeftGas()) {
		while(ec.isLeftGas()) {
			System.out.println("자동차 달립니다.가스 잔량 :"+ec.gas+"L\n");
			ec.gas--;
		}
	}
	}
}