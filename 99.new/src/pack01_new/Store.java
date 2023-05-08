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
//		Item item = new Item("������", 1000, 10,  new Status(), "Info");
//		menu = new Item[5];//�̸�, ����,����, (��, ��ø, ����, ȭ��, �ܸ�, ü��, ��), ����
		menu.add(new Item("������",   1000, 10, new Status(),"�ݵ��� ���� ������"));
		menu.add(new Item("����Ÿ",   2000,  5, new Status(),"�ݵ��� ���� ����Ÿ"));
		menu.add(new Item("�޷γ�",    800, 20, new Status(),"�ݵ��� ���� �޷γ�"));
		menu.add(new Item("������",    100,  2, new Status(),"�ݵ��� ���� ������"));
		menu.add(new Item("�Һ���",   1000,  5, new Status(),"�ݵ��� ���� �Һ���"));
	}
	
	
	
	// 2.
	public void mixMenu() {
		for (int i = 0; i < sellMenu.length; i++) {
			int random=(int) ((Math.random() * menu.size()));
			sellMenu[i]=random;
		}
	}
	
	public void showMenu() {
		System.out.println("-------------[����]-------------");
		for (int i = 0; i < sellMenu.length; i++) {
			System.out.println((i+1) + ". " + menu.get(sellMenu[i]).name + " : " + menu.get(sellMenu[i]).price + " G,\t���:"+menu.get(sellMenu[i]).stock+"��");
		}
		System.out.println("---------(���� �ݾ�:"+UserStats.money+")--------");
	}
	
	//
	public String menuInfo() {
		System.out.print("\n������ ���� ���� �޴� ��ȣ�� �Է����ּ���.\n(-1 �Է� �� ���� ���� ����)\n=>");
		try {
			selectNum = Integer.parseInt(sc.nextLine());
			if (selectNum == -1) {
				return "";
			} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
				return "������: "+menu.get(sellMenu[selectNum-1]).name+"\n����:"+menu.get(sellMenu[selectNum-1]).info+"\n";
			} else {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");

			}
		} catch (Exception e) {
			System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
		}
		return "";
	}
	
	// 3.��� ���� �޴��� �����ϴ� �޼ҵ�.	
	public int buySelect() {
		while (true) {
			System.out.print("\n�����ϰ� ���� �޴� ��ȣ�� �Է����ּ���.(���� �ݾ�:"+UserStats.money+")\n(-1����)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
					return (selectNum - 1);
				} else {
					System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	
	public void buyItem(int selectNum) {
		if (menu.get(sellMenu[selectNum]).stock < 1) {
			System.out.println("��� �����մϴ�.");
		}else if(inven[inven.length-1]!=null){
			System.out.println("�κ��丮�� ������ �����ϴ�.");
		}else if((UserStats.money-menu.get(sellMenu[selectNum]).price)<0){
			System.out.println("������ ������ ���� �����ϴ�.");
		}else {
			sales = sales + menu.get(sellMenu[selectNum]).price;
			menu.get(sellMenu[selectNum]).stock--;
			UserStats.money-=menu.get(sellMenu[selectNum]).price;
			for(int i=0;i<inven.length;i++) {
				if(inven[i]==null) {
					inven[i]=menu.get(sellMenu[selectNum]);
					break;
				}
			}//�Ʒ� syso ������ �ȵ�...
			System.out.println(menu.get(sellMenu[selectNum]).name + "��(��) �����ϼ̽��ϴ�."
					+ "(���� �ݾ� : "+UserStats.money+")");
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
	
	// 3.�Ȱ� ���� �޴��� �����ϴ� �޼ҵ�.	
	
	public int sellSelect() {
		while (true) {
			showInventory();
			System.out.print("�Ȱ� ���� ��� ��ȣ�� �Է����ּ���.\n(-1 �Է� �� ����)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <=inven.length) {
					return (selectNum - 1);
				} else {
					System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
			}
		}
	}
	

	
	public void sellItem(int select) {
		if (select>=inven.length||select<0){
			System.out.println("\n���� ���� �������Դϴ�.");
		}else if(inven[select]==null) {
			System.out.println("\n�ش� �������� ��� �����ϴ�.");
		}else {
			UserStats.money+=(inven[select].price)/10;
			System.out.println(inven[select].name + "��(��) �ǸŵǾ����ϴ�.\n�Ǹ� �ݾ� : "+(inven[select].price/10)+"�� ȹ���߽��ϴ�.\n");
			inven[select]=null;
		}
	}
	
	public void shop(){
		mixMenu();
		while(true) {
			try {
				showMenu();
				System.out.print("\n(1.���� / 2.���� / 3.�Ǹ� / 4.������)\n=>");
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
					System.out.println("������ �����ϴ�.");
					System.out.println("----------------------------------------");
					break;
				}else {
					System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
				}
			} catch (Exception e) {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");}	
		}
	}
}