package pack02.horsegame;

public class Player extends Thread {
	//�����带 ������ Player��� Ŭ������ �̿��Ͽ� �����.
	//� �����尡 ���� ���������� ���� ����� ���� �渶����.
	int num; //������ ��ȣ, 
	int speed;//���� �ӵ�
	
	public Player(int num, int speed) {
		this.num = num;
		this.speed = speed;
	}
	
	//thread.start(); �۾��� �ݵ�� run�޼ҵ忡 �����Ѵ�. (interface�� ��쿡�� run)
	@Override
	public void run() {
		int hereLocation=0; //0�������� ����Ѵٰ� ������ ����.
		while(hereLocation<100) {
			hereLocation+=speed;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		PlayMain.rank++;
		if(PlayMain.choice==num&&PlayMain.rank==1 ) {
			System.out.println("����");
		}else if(PlayMain.choice!=num&&PlayMain.rank==1 ){
			System.out.println("Ʋ��");
		}
		System.out.println(PlayMain.rank+"��, "+num+"�� ��");
		
		

	}
	
}