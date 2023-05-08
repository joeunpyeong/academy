package pack00_x;
import java.util.Scanner;

public class New_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int power = 0, agi=0, inte=0, nar=0, app=0, hp = 1, money=0, fame = 0; //능력치
			String userName;//유저 이름
			int st=0;//유저 선택
			int fullInven=6;
			int[] inventory = new int[(fullInven)]; // 0~5 ,총 6개의 인벤토리
			int[] shopInv = new int [8]; //무작위 8개의 상점 물품
			int a=0;//인벤토리 남은 공간, 6이최대
			New_Status Status = new New_Status();
			New_Shop shop = new New_Shop();
			
			System.out.println("게임 이름 \n닉네임을 입력해주세요");
			System.out.print("사용자의 닉네임 : ");
			userName = sc.nextLine(); // String userName 유저 이름
			System.out.println("");
			//------------------------------------------
			while (true) {//status 설정
				try {
					System.out.println("원하는 능력치 배분 방식을 선택해주세요\n1.랜덤 능력치를 획득합니다.\n2.능력치를 선택합니다.");
					System.out.print("=>");
					st = Integer.parseInt(sc.nextLine());
					
					if(st==1) {//랜덤능력치
						Status.auto();
						power=Status.power;
						agi=Status.agi;
						inte=Status.inte;
						nar=Status.nar;
						app=Status.app;
						hp=Status.hp;
						money=Status.money;
						fame=Status.fame;
						break;
					}else if(st==2){//선택능력치
						Status.select();
						power=Status.power;
						agi=Status.agi;
						inte=Status.inte;
						nar=Status.nar;
						app=Status.app;
						hp=Status.hp;
						money=Status.money;
						fame=Status.fame;
						break;
					}else {
						System.out.println("선택지를 재입력해주세요.\\n------------------------");
					}
					
				} catch (Exception e) {
					System.out.println("선택지를 재입력해주세요.\n------------------------");
				}
			}//status 설정완료
		//------------------------------------------
			sc.nextLine();
			shop.Shop(money, shopInv, inventory, fullInven, a);
			
			
			
		}
	}
}
