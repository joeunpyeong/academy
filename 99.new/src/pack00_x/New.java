package pack00_x;

import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 준비

		int st = 0, st1 = 0; // 스토리
		int power=0, agi=0, inte=0, nar=0, app=0, hp = 1, money=0, fame = 0; // 능력치
		int cat = 0; // 장비,동물,도구
		int[] inventory = new int[6]; // 0~5 ,총 6개의 인벤토리
		String catName = null;
		// 시작
		while (true) {
			System.out.println("게임 이름 \n닉네임을 입력해주세요");
			System.out.print("사용자의 닉네임 : ");
			String userName = sc.nextLine(); // String userName 유저 닉네임
//------
			System.out.println("본 게임이 시작되면 선택지만을 고르셔야합니다.\n");

			// 1
			System.out.println("찬 바람에 눈을 뜬 당신은 울창한 숲 속에서 나뭇잎을 헤치며 깨어났습니다.\n분명 집 안에서 깨어났어야하는데 말이죠.\n");
			System.out.println("1.여기저기 돌아다녀 본다. 2.나무 위에 올라가서 주위를 살핀다.");
			while (true) {
				System.out.print("=>");
				st = Integer.parseInt(sc.nextLine());
				if (st == 1) { // 1-1
					System.out.println(
							"울창한 숲 속을 돌아다니던 중 사나운 고양이(힘:2 ,민첩 3)와 마주쳤습니다. 싸우시겠습니까?\n 1.싸운다(힘:2이상) 2.도망친다(민첩:3이상) 3.길들인다(지능:6이상)");
					System.out.print("=>");
					st1 = Integer.parseInt(sc.nextLine());
					if (st1 == 1) {// 1-1-1
						if (agi >= 4) {// 1-1-1.1
							System.out.println("사나운 고양이를 쫓아냈습니다.");
							System.out.print("당신은 의기양양하게 길을 나섭니다. \n걷다보니 ");
						} else {// 1-1-1.2
							System.out.println("허약한 당신은 고양이 고양이에게 물렸습니다.");
							hp -= 2;
							System.out.println("(체력이 2 감소했습니다. 현제 체력 :" + hp + ")");
							System.out.print("당신은 지친 몸을 이끌며 걷다보니 ");
						}
					} else if (st1 == 2) { // 1-1-2
						if (agi >= 4) {// 1-1-2.1
							System.out.println("당신은 무사히 도망쳤습니다.");
							System.out.print("도망친 당신은 우연히 ");
						} else {// 1-1-2.2
							System.out.println("도망치는 도중 뒤를 쫓아오던 고양이에게 물렸습니다.");
							hp -= 2;
							System.out.println("(체력이 2 감소했습니다. 현제 체력 :" + hp + ")");
							System.out.print("당신은 지친 몸을 이끌며 걷다보니 ");
						}
					} else if (st1 == 3) {
						System.out.print("고양이에게 다가가 길들이기를 시도합니다.");
						if (inte >= 6) {// 1-1-2.1
							System.out.println("오래전 TV에서 본 지식을 통해 고양이를 길들일 수 있었지만 \n길들이는 과정에서 고양이에게 긁혔습니다.");
							hp--;
							System.out.println("(체력이 1 감소했습니다. 현제 체력 :" + hp + ")");
							cat++;
							System.out.print("우여곡절 끝에 당신은 고양이를 길들였습니다.\n 앞으로 당신과 여정을 함께 할 고양이의 이름을 지어주세요.\n=>");
							catName = sc.nextLine();
							System.out.print("당신은 고양이" + catName + "와 같이 길을 나서기 시작하자 ");
						} else {// 1-1-2.2
							System.out.println("서툰 손길에 고양이가 흥분하며 당신을 할큅니다.");
							hp -= 6;
							System.out.println("(체력이 6 감소했습니다. 현제 체력 :" + hp + ")");
							System.out.print("당신은 지친 몸을 이끌며 걷다보니 ");
						}
						System.out.println("작은 마을을 발견했습니다.");
					}
					break;
				} else if (st == 2) {// 1-2
					System.out.println("나무 위에서 내려다보니 몇 미터 안되는 곳에 작은 마을이 보입니다.");
					break;
				} else {
					System.out.println("존재하지 않는 선택지입니다. 다시 입력해 주세요.");
				}
			}
			// 2
			System.out.print("당신은 마을 입구에 도착했습니다. 마을로 들어가려던 찰나\n마을 입구에서 창을 든 사람이 당신에게 걸어오며 말을 겁니다.\n\"외지인이여 넌 누구지?\""
					+ "\n알려주고 싶은 이름을 입력하세요. \n 내 이름은  ");
			String sSay = sc.nextLine();
			if (!userName.equals(sSay)) { // .equals() ->문자열 비교 가능하게 시키는 것
				System.out.println("낯선 사람이 얼굴을 찌뿌리며 창을 들이댑니다. 그리고 서서히 입을 열기 시작했습니다. \"넌 지금 거짓말을 하고 있군\"");
				fame--;
				System.out.println("(명성이 1 감소했습니다. 현제 명성 :" + fame + ")");
			}
			System.out.print("\"너의 이름을 물어본게 아니다.");
			if (cat > 1) {
				System.out.println("어찌 됐ㄷ..\"/n" + "낯선 사람은 " + catName + "를 보자 ");

			} else {
				System.out.println("어찌 됬든.. 너는 이 마을에 들어올 수 없다. \n경고는 여기까지다 이 마을에 들어오려 한다면... \"");
			}

		}
	}
}
//int random = (int)(Math.random()*6)+1;   언젠가 사용할 랜덤함수

//능력치 힘power, 자본money, 민첩agi, 지능inte, 화법nar, 외모app, 건강helth
//sSay(마을사람에게 알려준 이름), 코인coin(게임 플레이 횟수), st숫자(플레이어가 선택한 선택지 숫자)
//String userName  유저 닉네임
//inventory

//스토리 짜는건 힘드네요

//Ex02_Array 상점 만들때 쓸만 함