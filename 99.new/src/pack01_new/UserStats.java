package pack01_new;

import java.util.Scanner;

public class UserStats {
	Scanner sc = new Scanner(System.in);
	Status stat= new Status();
	static int money;
	int st;

	void auto() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter를 누르면 무작위 능력치와 골드를 획득합니다.");
		sc.nextLine();

		System.out.println("---------");
		System.out.print("  힘 : ");
		stat.power = (int) (Math.random() * 10) + 1;
		System.out.println(stat.power);

		System.out.print("민첩 : ");
		stat.agi = (int) (Math.random() * 10) + 1;
		System.out.println(stat.agi);

		System.out.print("지능 : ");
		stat.inte = (int) (Math.random() * 10) + 1;
		System.out.println(stat.inte);

		System.out.print("화법 : ");
		stat.nar = (int) (Math.random() * 10) + 1;
		System.out.println(stat.nar);

		System.out.print("외모 : ");
		stat.app = (int) (Math.random() * 10) + 1;
		System.out.println(stat.app);

		System.out.print("체력 : ");
		stat.hp = (int) (Math.random() * 10) + 1;
		System.out.println(stat.hp);

		System.out.print("명성 : ");
		stat.fame = (int) (Math.random() * 10) + 1;
		System.out.println(stat.fame);

		System.out.print("보유한 금액 : ");
		money = ((int) (Math.random() * 10) + 1) * 100;
		System.out.println(money + "gold");
		System.out.println("---------");
		
	}
	
	void select() {
		int all=0;
//		New_Shop shop = new New_Shop();
		System.out.print("능력치를 ");
		while(true) {
			System.out.println("설정해주세요.(능력치의 총 합은 최대 35)");
			
			System.out.println("---------");
			System.out.print("  힘 : ");
			stat.power = input();
			all+=stat.power;

			System.out.print("민첩 : ");
			stat.agi = input();
			all+=stat.agi;

			System.out.print("지능 : ");
			stat.inte = input();
			all+=stat.inte;

			System.out.print("화법 : ");
			stat.nar = input();
			all+=stat.nar;

			System.out.print("외모 : ");
			stat.app = input();
			all+=stat.app;

			System.out.print("체력 : ");
			stat.hp = input();
			all+=stat.hp;

			System.out.print("명성 : ");
			stat.fame = input();
			all+=stat.fame;

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
		
	
	
	int input() {
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
