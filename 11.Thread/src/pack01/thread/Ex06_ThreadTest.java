package pack01.thread;

public class Ex06_ThreadTest {
	//YoutubeThread��� �۾��� �ϳ� ������ ���� => 1�ʿ� �ѹ��� �������� ������Դϴ�.(�ܼ�)
	//MelonThread��� �۾��� �ϳ� ������ ���� =>3�ʿ� �ѹ��� ������ ������Դϴ�.(�ܼ�)
	//ThreadTest ������ YoutubeThred�� MelonThred�� ���� ������
	
	//�ΰ��� ����� ���� ����ǰ� ó��
	public static void main(String[] args) {
		
		Thread[] threadArr = new Thread[2];
		threadArr[0]=new Ex06_YoutubeThread();
		threadArr[1]=new Ex06_MelonThread();
		
		threadArr[0].start();
		threadArr[1].start();
		
		
	}
}