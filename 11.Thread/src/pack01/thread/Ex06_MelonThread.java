package pack01.thread;

public class Ex06_MelonThread extends Thread{
	public Ex06_MelonThread() {
		//Thread의 멤버 메소드중에 setName이라는 setter메소드가 있음.(작업에 이름을 주는 메소드)
		setName("멜론");
	}
	
	
	@Override
	public void run() {
		for(;;) {
			System.out.println(getName() + ": 3초에 한번씩 음악을 재생중입니다.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
