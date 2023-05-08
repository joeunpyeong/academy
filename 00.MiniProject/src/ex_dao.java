import java.util.Scanner;

public class ex_dao {
	 Scanner sc = new Scanner(System.in);
	 
	//음성 발신 
	void messageSend() {
		System.out.print("  나  :");
		sc.nextLine();
	}
	//음성 수신
	void messageReceive() {
		System.out.print("상대방:");
		sc.nextLine();
	}
	//dmb방송 켜기
	public static void dmbOn() {
		System.out.println("DMB방송을 켭니다:");
	}
	//dmb 방송 채널 변경
	public static void dmBChange() {
		System.out.println("DMB방송의 채널을 변경합니다.");
	}
	//dmb방송 끄기
	public static void dmbOff() {
		System.out.println("DMB방송을 끕니다.");
	}
	//인터넷 켜기
	public static void internetOn() {
		
	}
	
	//인터넷 끄기
	public static void internetOff() {
		
	}
	
	//웹툰 보기
	public static void webtoonOn() {
		
	}
	
	//웹툰 끄기
	public static void webtoonOff() {
		
	}
}
