package pack02.horsegame;

import java.util.Random;
import java.util.Scanner;

public class PlayMain {
	public static int rank=0;
	public static int choice=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� �� ��Ⱑ ���۵˴ϴ�.");
		//5���� ���� ����.
		//����ڷκ��� �� �� ���� 1���� �� ���� �Է��ϰ� �����.
		//�´��� Ʋ������ ����ϴ� ������ �־��
		
		while (true) {
			try {
				System.out.print("1���� �� �� ��ȣ�� �Է�:");
				choice=Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("��ȣ�� ���Է��ϼ���.");
			}
		}
		
		Player p1=new Player(1, new Random().nextInt(10)+1);
		Player p2=new Player(2, new Random().nextInt(10)+1);
		Player p3=new Player(3, new Random().nextInt(10)+1);
		Player p4=new Player(4, new Random().nextInt(10)+1);
		Player p5=new Player(5, new Random().nextInt(10)+1);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		
	}
}