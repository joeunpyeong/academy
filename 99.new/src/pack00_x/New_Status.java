package pack00_x;
import java.util.Scanner;

public class New_Status {
	int power, agi, inte, nar, app, hp = 1, money, fame = 0;
	int st;

	void auto() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter�� ������ ������ �ɷ�ġ�� ��带 ȹ���մϴ�.");
		sc.nextLine();

		System.out.println("---------");
		System.out.print("  �� : ");
		power = (int) (Math.random() * 10) + 1;
		System.out.println(power);

		System.out.print("��ø : ");
		agi = (int) (Math.random() * 10) + 1;
		System.out.println(agi);

		System.out.print("���� : ");
		inte = (int) (Math.random() * 10) + 1;
		System.out.println(inte);

		System.out.print("ȭ�� : ");
		nar = (int) (Math.random() * 10) + 1;
		System.out.println(nar);

		System.out.print("�ܸ� : ");
		app = (int) (Math.random() * 10) + 1;
		System.out.println(app);

		System.out.print("ü�� : ");
		hp = (int) (Math.random() * 10) + 1;
		System.out.println(hp);

		System.out.print("���� : ");
		fame = (int) (Math.random() * 10) + 1;
		System.out.println(fame);

		System.out.print("������ �ݾ� : ");
		money = ((int) (Math.random() * 10) + 1) * 100;
		System.out.println(money + "gold");
		System.out.println("---------");
		
	}
	
	void select() {
		Scanner sc = new Scanner(System.in);
		int all=0;
//		New_Shop shop = new New_Shop();
		System.out.print("�ɷ�ġ�� ");
		while(true) {
			System.out.println("�������ּ���.(�ɷ�ġ�� �� ���� �ִ� 35)");
			
			System.out.println("---------");
			System.out.print("  �� : ");
			power = numErr();
			all+=power;

			System.out.print("��ø : ");
			agi = numErr();
			all+=agi;

			System.out.print("���� : ");
			inte = numErr();
			all+=inte;

			System.out.print("ȭ�� : ");
			nar = numErr();
			all+=nar;

			System.out.print("�ܸ� : ");
			app = numErr();
			all+=app;

			System.out.print("ü�� : ");
			hp = numErr();
			all+=hp;

			System.out.print("���� : ");
			fame = numErr();
			all+=fame;

			System.out.print("������ �ݾ� : ");
			money = ((int) (Math.random() * 10) + 1) * 100;
			System.out.println(money + "gold");
			System.out.println("---------");
			if(all>35) {
				System.out.println("�ٽ�");
			}else {
				break;
			}
		}
	}
		
	
	
	int numErr() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				st = Integer.parseInt(sc.nextLine());
				if(st<0) {
					System.out.print("���Է����ּ���.\n------------------------\n=>1");

				}else {
					break;
				}
			} catch (Exception e) {
				System.out.print("���Է����ּ���.\n------------------------\n=>2");
			}
		}
		return st;
	}
}

