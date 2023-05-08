package pack02.horsegame;

import java.util.Random;
import java.util.Scanner;

public class PlayMain {
	public static int rank=0;
	public static int choice=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("잠시 후 경기가 시작됩니다.");
		//5개의 말이 있음.
		//사용자로부터 몇 번 말이 1등을 할 건지 입력하게 만들고.
		//맞는지 틀린지를 출력하는 로직을 넣어보기
		
		while (true) {
			try {
				System.out.print("1등이 될 말 번호를 입력:");
				choice=Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("번호를 재입력하세요.");
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
