package PhoneSimulator;

import java.util.Scanner;

public class SuperPhone {
	Scanner sc = new Scanner(System.in);
	void inspect() {}
}

class Phone extends SuperPhone {
	int powerToggle=-1,callToggle=-1;
	@Override
	void inspect() {
		System.out.println("1");
	}
	
	//전원 토글
	void togglePower() {
		powerToggle=-powerToggle;
		if(powerToggle<0) {
			System.out.println("핸드폰의 전원이 꺼집니다.");
		}else if(powerToggle>0){
			System.out.println("핸드폰의 전원이 켜집니다.");
		}
	}
	
	//전화 토글
	void toggleCall() {
		callToggle=-callToggle;
		if(callToggle>0) {
			System.out.println("전화 기능을 켭니다.");
		}else if(callToggle<0){
			System.out.println("전화 기능을 끕니다.");
		}
	}
	
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
	
	void session() {
		
	}
}
class DMB extends Phone {
	int dmbToggle=-1, channal=0;
	@Override
	void inspect() {
		super.inspect();
		
		System.out.println("2");
	}
	
	@Override
	void session() {
		super.session();
	}
	
	//DMB토글
	void toggleDMB() {
		if(callToggle>0) {
			System.out.println("전화 기능이 사용 중입니다.\nDMB기능을 사용할 수 없습니다.");
		}else {
			dmbToggle=-dmbToggle;
			if(dmbToggle>0) {
				System.out.println("DMB를 켭니다.");
			}else if(dmbToggle<0){
				System.out.println("DMB를 끕니다.");
			}
		}
	}
	//DMB채널변경
	void changeChannel() {
		
	}
}

class SmartPhone extends DMB {
	int internetToggle=-1, webtoonToggle=-1;
	@Override
	void inspect() {
		super.inspect();
		
		System.out.print("3");
	}
	
	@Override
	void session() {
		super.session();
	}
	
	//인터넷 토글
	void toggleInternet() {
		internetToggle=-internetToggle;
		if(internetToggle<0) {
			System.out.println("인터넷을 켭니다.");
		}else if(internetToggle>0){
			System.out.println("인터넷을 끕니다.");
		}
	}
	
	//웹툰 토글
	void toggleWebtoon() {
		webtoonToggle=-webtoonToggle;
	}
}
