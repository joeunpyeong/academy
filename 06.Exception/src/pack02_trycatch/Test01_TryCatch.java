package pack02_trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
		//배열의 랜덤한 공간에 숫자 숨기기 게임.
		//기존 로직은 그대로 사용하면 됨.
		//단, 사용자의 입력은 자유로운데 잘못 입력 시
		//"잘못된 입력입니다. 숫자범위?~?까지만 입려해주세요"
		//가 나오고 프로그램은 강제로 종료되는 경우가 없다.(게임 끝까지)
		
		
		public static void main(String[] args) {

			while (true) {
				Scanner sc = new Scanner(System.in);
				int count = 0;
				int userNum=0;
				int[]array=new int[0];
				
				System.out.println("고양이 찾기 게임이 시작되었습니다.");
				System.out.print("난이도를 입력 : ");
				
				while (array.length < 1) {
					try {
						userNum = Integer.parseInt(sc.nextLine()); // 숫자 외에 값 입력 오류!
						array = new int[userNum]; // -값 또는 들어오면 오류
					} catch (Exception e) {
						System.out.println("숫자 오류 1이상의 숫자를 입력해주세요.");
					}
				}
				
				System.out.println("난이도 : " + userNum);

				array = new int[userNum];
				array[(int) (Math.random() * array.length)] = 1;

				for (int i = 0; i < userNum; i++) {
					System.out.println("[" + (i + 1) + "번 상자]");
				}

				while (true) {
					System.out.print("상자번호를 입력하시오\n=>");
					int userAnswer=0;
					
					while (true) {
						try {
							userAnswer= Integer.parseInt(sc.nextLine());;

							userAnswer-=1;
							count += 1;// 숫자 외에 값 입력 오류!
							if (userNum - 1 < userAnswer || 0 > userAnswer) {
								System.out.println("재입력하세요.\n");
							} else if (array[userAnswer] == 1) {
								System.out.println("고양이를 찾았습니다.\n");
								for (int i = 0; i < userNum; i++) {
									if (array[i] == 1) {
										System.out.println("[고양이]");

									} else {
										System.out.println("[" + (i + 1) + "번 상자]");
									}
								}
								System.out.println("시도 횟수는 :" + count + "번 입니다.\n\n\n\n");
								break;
							} else {
								System.out.println("고양이가 없습니다.\n");

							} // -값 또는 들어오면 오류
							
						}catch (Exception e) {
							System.out.println("숫자 오류 1이상의 숫자를 입력해주세요.");
						}
					}
					
					break;
			}

		}
	}
		
}

