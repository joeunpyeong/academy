package pack02_phone;

import java.util.Scanner;

public class PhoneDAO {
	static Scanner sc = new Scanner(System.in);
	static int input;//일단
	static boolean call=false,voice=false,dmb=false,internet=false,webtoon=false;
	
	//메뉴판
	static boolean mainDisplay(int VERSION) {
		while(true) {
			if(call==false) {	//버전 1
				System.out.println("\n1.전화");
			}else if(call==true) {
				System.out.println("1.음성 발신");
			}
			if(VERSION>=2 &&dmb==false) {	//버전2
				System.out.println("2.DMB 방송 켜기");
			}else if(VERSION>=2 &&dmb==true) {
				System.out.println("2.DMB 방송 끄기");
			}else if(VERSION==1){
				System.out.println("2.핸드폰 Off");
			}else if(call==true) {
				System.out.println("2.음성 수신");
			}
			if(VERSION>=3 && internet==false) {//버전 3
				System.out.println("3.인터넷 켜기");
			}else if((VERSION>=3 && internet==true)) {
				System.out.println("3.인터넷 끄기");
			}else if(VERSION==2){
				System.out.println("3.핸드폰 Off");
			}else if(call==true) {
				System.out.println("3.전화 끊기");
			}
			if(VERSION>=3 && webtoon==false) {
				System.out.println("4.웹툰 보기");
			}else if(VERSION>=3 && webtoon==true){
				System.out.println("4.웹툰 끄기");
			}
			if(VERSION==3) {
				System.out.println("5.핸드폰 Off");
			}
			System.out.println("상태정보 : ");
			
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
			}
			
			
			switch(input){
			case 1:
				if(call==false) {	//버전 1
					System.out.println("\n1.전화");
					call=true;
				}else if(call==true) {
					messageSend();
				}
				break;
			case 2:
				if(VERSION>=2 &&dmb==false) {	//버전2
					System.out.println("2.DMB 방송 켜기");
				}else if(VERSION>=2 &&dmb==true) {
					System.out.println("2.DMB 방송 끄기");
				}else if(VERSION==1){
					System.out.println("2.핸드폰 Off");
				}else if(call==true) {
					messageReceive();
				}
				break;
			case 3:
				if(VERSION>=3 && internet==false) {//버전 3
					System.out.println("3.인터넷 켜기");
				}else if((VERSION>=3 && internet==true)) {
					System.out.println("3.인터넷 끄기");
				}else if(VERSION==2){
					System.out.println("3.핸드폰 Off");
				}else if(call==true) {
					System.out.println("3.전화 끊기");
				}
				break;
			case 4:
				if(VERSION>=3 && webtoon==false) {
					System.out.println("4.웹툰 보기");
				}else if(VERSION>=3 && webtoon==true){
					System.out.println("4.웹툰 끄기");
				}
				break;
			default:
				break;
			}
			
			return true;
			
			
		}
	}
	
	//핸드폰 상태정보
	
	
	//음성 발신 
	public static void messageSend() {
		System.out.print("  나  :");
		sc.nextLine();
	}
	//음성 수신
	public static void messageReceive() {
		System.out.print("상대방:");
		sc.nextLine();
	}
	//dmb방송 켜기
	public static void dmbOn() {
		
	}
	//dmb방송 끄기
	public static void dmbOff() {
		
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
