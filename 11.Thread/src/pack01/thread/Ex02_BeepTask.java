package pack01.thread;

import java.awt.Toolkit;

//Runnable이라는 작업 인터페이스:implements<==내부에 있는 멧드를 뭊건 구현하겠다.
public class Ex02_BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0;i<5; i++) {
			toolkit.beep();//절대 외워나 공부 x, 이번 장 책예제에 있기 때문에 사용함
			System.out.println("띠로롱");
			//메인쓰레드가 계속해서 작업을 하는게 아니라, 몇 초 정도의 휴지시간(멈춤)을 가지고
			//동작하게 처리.
			try {
				Thread.sleep(1*2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
