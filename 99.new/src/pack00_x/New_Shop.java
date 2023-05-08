package pack00_x;
import java.util.Scanner;

public class New_Shop {
	int money, fullInven=6,fullShop=6;
	int shopInv[]=new int[fullShop-1];
	int[] inventory = new int[(fullInven)];
	int a=0;//인벤토리 남은 공간, 6이최대
	
	void Shop(int money, int[] shopInv, int[]inventory,int fullInven,int a) {
		Scanner sc = new Scanner(System.in);
		
		this.inventory=inventory;
		this.money = money;
		this.shopInv = shopInv;
		this.fullInven =fullInven;
		this.a=a;
		
		int stock=6; //장비 개수 올라갈때마다 stock수정
		int st=0;//유저선택
		
		for(int i=0; i<fullShop;i++) {//0~8개의 공간에 랜덤한 번호지정.
			shopInv[i]=(int) (Math.random() * stock)+1;
		}
		
		for(int i=0;i<6;i++) {//랜덤한 번호에 맞게 공간에 장비를 넣음
			System.out.print((i+1)+"번 창고:");
			switch (shopInv[i]) {
			case 1:
				System.out.println("장비1");
				System.out.println("장비 가격="+10+"gold");
				money-=10;
				break;
			case 2:
				System.out.println("장비2");
				System.out.println("장비 가격="+10+"gold");
				money-=10;
				break;
			case 3:
				System.out.println("장비3");
				System.out.println("장비 가격="+10+"gold");
				money-=10;
				break;
			case 4:
				System.out.println("장비4");
				System.out.println("장비 가격="+10+"gold");
				money-=10;
				break;
			case 5:
				System.out.println("장비5");
				System.out.println("장비 가격="+10+"gold");
				money-=10;
				break;
			case 6:
				System.out.println("장비6");
				System.out.println("장비 가격="+10+"gold");
				money-=10;
				break;
			default:
				break;
			}
			System.out.println("");

		}
		
		for(int i=0;i<(fullInven-1);i++) {
			if(inventory[i]!=0) {
				a++;
			}
		}
		if(a>fullInven) {
			System.out.println("인벤토리가 가득 차있습니다.");
		}else {
			System.out.println("인벤토리("+a+"/"+fullInven+")");
			while(a<6) {//머리아프다 여기 밑으로
				try {
					System.out.print("구매할 물품을 선택해 주세요.(0번 입력시 상점 종료)\n=>");
					st = Integer.parseInt(sc.nextLine());
					if(st==0) {
						System.out.println("구매를 종료합니다.");
						System.out.println("인벤토리("+a+"/"+fullInven+")");
						break;
					}else if(st<0||st>stock) {
						System.out.print("선택지를 재입력해주세요.\n------------------------\n1");
					}else if(shopInv[(st-1)]==0) {
						System.out.println(st+"번 창고에 물품이 없습니다.");
					}else if(st<=fullShop){
						inventory[a]=shopInv[(st-1)];
						a++;
						shopInv[(st-1)]=0;
						System.out.println(st+"번 물품을 구매했습니다.");
						System.out.println("인벤토리("+a+"/"+fullInven+")");
					}
				} catch (Exception e) {
					System.out.print("선택지를 재입력해주세요.\n------------------------\n=>2");
				}
				System.out.println("");
			}
		}
		
	}
}






