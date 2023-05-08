package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_HightLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�궗�슜�옄�뿉寃� �엯�젰諛쏄린�쐞�븳 �뒪罹먮꼫
		int random = new Random().nextInt(100)+1;// �옖�뜡�븳�닔梨꾨쾲
		// for臾몄쓣 �씠�슜�빐�꽌 臾댄븳猷⑦봽 留뚮뱾�뼱蹂닿린.
//		for(int i = 0 ; i <5 ; i ++) {
//			i = 0; // 泥ル쾲吏몃갑踰� i媛� 利앷��빐�룄 �떎�떆 0�쑝濡� �닽�옄瑜� 諛붽퓭�꽌 怨꾩냽�빐�꽌 諛섎났�븯寃� �븳�떎.
//		}
//		for(int i = 0 ; i <1 ; i--) {
//			// i瑜� 利앷� x
//		}
		System.out.println("HighLow寃뚯엫�쓣 �떆�옉�빀�땲�떎.");
		int count = 0 ;
		for(;;) { // while(true) �� 媛숈쓬
			System.out.println(random);
			System.out.println("�닽�옄瑜� �엯�젰�빐�꽌 �젙�떟�쓣 留욎떠二쇱꽭�슂.");
			int userNum = Integer.parseInt(sc.nextLine());
			count ++ ;
			if(userNum == random) {
				break;
			}else if ( userNum < random) { // 10 < 50
				System.out.println("�뜑 �겙�닔瑜� �엯�젰�빐二쇱꽭�슂");
			}else {
				System.out.println("�뜑 �옉���닔瑜� �엯�젰�빐二쇱꽭�슂");
			}
		}
		System.out.println(count + " �쉶 �떆�룄 �젙�떟�엯�땲�떎.");
		
	}
}
