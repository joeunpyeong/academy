package pack01.thread;

public class Ex02_BeepMain {
	public static void main(String[] args) {
		//Ex02_BeepTask eb=new Ex02_BeepTask(); 인스턴스화: 객체를 메모리에 올려서 (eb)사용 할 준비 함
		Runnable eb= new Ex02_BeepTask();
		eb.run();
		//객체를 생성할 때 쓰이는 메소드 : 생성자 메소드
		//생성자 메소드는 클래스의 이름과 똑같음
		//메소드이기 때문에 오버로딩이 가능하다 (같은 이름으로 타입이나 , 파라메터 개수를 바꿔서 중첩시키는 것)
		Thread thread = new Thread(eb);
		thread.start();
		System.out.println("여기는 내가 쓴 코드가 이습니다.");
		for(int i=0; i<5;i++) {
			System.out.println("메인 띠로롱");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
