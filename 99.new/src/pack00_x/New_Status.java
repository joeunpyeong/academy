package pack00_x;
import java.util.Scanner;

public class New_Status {
	int power, agi, inte, nar, app, hp = 1, money, fame = 0;
	int st;

	void auto() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter를 누르면 무작위 능력치와 골드를 획득합니다.");
		sc.nextLine();

		System.out.println("---------");
		System.out.print("  힘 : ");
		power = (int) (Math.random() * 10) + 1;
		System.out.println(power);

		System.out.print("민첩 : ");
		agi = (int) (Math.random() * 10) + 1;
		System.out.println(agi);

		System.out.print("지능 : ");
		inte = (int) (Math.random() * 10) + 1;
		System.out.println(inte);

		System.out.print("화법 : ");
		nar = (int) (Math.random() * 10) + 1;
		System.out.println(nar);

		System.out.print("외모 : ");
		app = (int) (Math.random() * 10) + 1;
		System.out.println(app);

		System.out.print("체력 : ");
		hp = (int) (Math.random() * 10) + 1;
		System.out.println(hp);

		System.out.print("명성 : ");
		fame = (int) (Math.random() * 10) + 1;
		System.out.println(fame);

		System.out.print("보유한 금액 : ");
		money = ((int) (Math.random() * 10) + 1) * 100;
		System.out.println(money + "gold");
		System.out.println("---------");
		
	}
	
	void select() {
		Scanner sc = new Scanner(System.in);
		int all=0;
//		New_Shop shop = new New_Shop();
		System.out.print("능력치를 ");
		while(true) {
			System.out.println("설정해주세요.(능력치의 총 합은 최대 35)");
			
			System.out.println("---------");
			System.out.print("  힘 : ");
			power = numErr();
			all+=power;

			System.out.print("민첩 : ");
			agi = numErr();
			all+=agi;

			System.out.print("지능 : ");
			inte = numErr();
			all+=inte;

			System.out.print("화법 : ");
			nar = numErr();
			all+=nar;

			System.out.print("외모 : ");
			app = numErr();
			all+=app;

			System.out.print("체력 : ");
			hp = numErr();
			all+=hp;

			System.out.print("명성 : ");
			fame = numErr();
			all+=fame;

			System.out.print("보유한 금액 : ");
			money = ((int) (Math.random() * 10) + 1) * 100;
			System.out.println(money + "gold");
			System.out.println("---------");
			if(all>35) {
				System.out.println("다시");
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
					System.out.print("재입력해주세요.\n------------------------\n=>1");

				}else {
					break;
				}
			} catch (Exception e) {
				System.out.print("재입력해주세요.\n------------------------\n=>2");
			}
		}
		return st;
	}
}


