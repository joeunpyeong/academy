package pack01_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
	Scanner sc = new Scanner(System.in);
	
	List<Item> menu = new ArrayList<>();
	
	int[] sellMenu=new int[8];
	int random,sales=0,selectNum;
	Item[] inven= new Item[6];
	
	// 1.
	public Store() {
//		Item item = new Item("꼬깔코", 1000, 10,  new Status(), "Info");
//		menu = new Item[5];//이름, 가격,수량, (힘, 민첩, 지능, 화법, 외모, 체력, 명성), 정보
		menu.add(new Item("꼬깔콘",   1000, 10, new Status(),"반도의 흔한 꼬깔콘"));
		menu.add(new Item("맛스타",   2000,  5, new Status(),"반도의 흔한 맛스타"));
		menu.add(new Item("메로나",    800, 20, new Status(),"반도의 흔한 메로나"));
		menu.add(new Item("얼음컵",    100,  2, new Status(),"반도의 흔한 얼음컵"));
		menu.add(new Item("소보루",   1000,  5, new Status(),"반도의 흔한 소보루"));
	}
	
	
	
	// 2.
	public void mixMenu() {
		for (int i = 0; i < sellMenu.length; i++) {
			int random=(int) ((Math.random() * menu.size()));
			sellMenu[i]=random;
		}
	}
	
	public void showMenu() {
		System.out.println("-------------[상점]-------------");
		for (int i = 0; i < sellMenu.length; i++) {
			System.out.println((i+1) + ". " + menu.get(sellMenu[i]).name + " : " + menu.get(sellMenu[i]).price + " G,\t재고:"+menu.get(sellMenu[i]).stock+"개");
		}
		System.out.println("---------(소지 금액:"+UserStats.money+")--------");
	}
	
	//
	public String menuInfo() {
		System.out.print("\n정보를 보고 싶은 메뉴 번호를 입력해주세요.\n(-1 입력 시 정보 보기 종료)\n=>");
		try {
			selectNum = Integer.parseInt(sc.nextLine());
			if (selectNum == -1) {
				return "";
			} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
				return "아이템: "+menu.get(sellMenu[selectNum-1]).name+"\n설명:"+menu.get(sellMenu[selectNum-1]).info+"\n";
			} else {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");

			}
		} catch (Exception e) {
			System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
		}
		return "";
	}
	
	// 3.사고 싶은 메뉴를 선택하는 메소드.	
	public int buySelect() {
		while (true) {
			System.out.print("\n구매하고 싶은 메뉴 번호를 입력해주세요.(소지 금액:"+UserStats.money+")\n(-1종료)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
					return (selectNum - 1);
				} else {
					System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
			}
		}
	}
	
	
	public void buyItem(int selectNum) {
		if (menu.get(sellMenu[selectNum]).stock < 1) {
			System.out.println("재고가 부족합니다.");
		}else if(inven[inven.length-1]!=null){
			System.out.println("인벤토리에 공간이 없습니다.");
		}else if((UserStats.money-menu.get(sellMenu[selectNum]).price)<0){
			System.out.println("물건을 구매할 돈이 없습니다.");
		}else {
			sales = sales + menu.get(sellMenu[selectNum]).price;
			menu.get(sellMenu[selectNum]).stock--;
			UserStats.money-=menu.get(sellMenu[selectNum]).price;
			for(int i=0;i<inven.length;i++) {
				if(inven[i]==null) {
					inven[i]=menu.get(sellMenu[selectNum]);
					break;
				}
			}//아래 syso 실행이 안됨...
			System.out.println(menu.get(sellMenu[selectNum]).name + "을(를) 구매하셨습니다."
					+ "(소지 금액 : "+UserStats.money+")");
		}
	}


	//------------------------------------------------------------------------------------------------

	public void showInventory() {
		for (int i = 0; i < inven.length; i++) {
			try {
				if(inven[i].stock!=0)
					System.out.println((i+1) + ". " + inven[i].name + " : " + inven[i].price);
			} catch (Exception e) {}
		}
	}
	
	// 3.팔고 싶은 메뉴를 선택하는 메소드.	
	
	public int sellSelect() {
		while (true) {
			showInventory();
			System.out.print("팔고 싶은 장비 번호를 입력해주세요.\n(-1 입력 시 종료)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <=inven.length) {
					return (selectNum - 1);
				} else {
					System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
			}
		}
	}
	

	
	public void sellItem(int select) {
		if (select>=inven.length||select<0){
			System.out.println("\n옳지 않은 선택지입니다.");
		}else if(inven[select]==null) {
			System.out.println("\n해당 공간에는 장비가 없습니다.");
		}else {
			UserStats.money+=(inven[select].price)/10;
			System.out.println(inven[select].name + "이(가) 판매되었습니다.\n판매 금액 : "+(inven[select].price/10)+"을 획득했습니다.\n");
			inven[select]=null;
		}
	}
	
	public void shop(){
		mixMenu();
		while(true) {
			try {
				showMenu();
				System.out.print("\n(1.구매 / 2.정보 / 3.판매 / 4.나가기)\n=>");
				int select = Integer.parseInt(sc.nextLine());
				if(select==1) {
					while(true) {
						select = buySelect();
						if (select == -1) {	
							break;
						} else {	
							buyItem(select);
						}
					}
				}else if(select==2) {
					System.out.println(menuInfo());
				}else if(select==3) {
					while(true) {
						select = sellSelect();
						if (select == -1) {	
							break;
						} else {	
							sellItem(select);
						}
					}
				}else if(select==4) {
					System.out.println("상점을 떠납니다.");
					System.out.println("----------------------------------------");
					break;
				}else {
					System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");}	
		}
	}
}