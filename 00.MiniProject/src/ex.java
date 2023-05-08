import java.util.Scanner;

public class ex {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 ex_dao dao=new ex_dao();
	 int input=0, channel=0;
	 String status="";
	 boolean phone=true,call=false,dmb=false,internet=false,webtoon=false;
	
	 System.out.print("버전 입력(1~3): ");
	 int VERSION = Integer.parseInt(sc.nextLine());

	while(phone==true) {
		while(phone==true) {
			try {
				System.out.print("이니셜 1의 전원을 켜시겠습니까?\n 1.전원ON 2.전원OFF\n=>");
				input = Integer.parseInt(sc.nextLine());
				if(input==1) {
					break;
				}else if(input==2) {
					System.out.println("핸드폰이 종료됩니다.");
					phone=false;
					break;
				}
			} catch (Exception e) {
				System.out.println("선택지를 재입력해주세요.");
			}
		}
		
		while(phone==true) {
			System.out.println("\n------------------");
			if(VERSION>1&&call==true) {
				System.out.println("0.전화 끊기");
			}
			if(call==false) {	//버전 1
				System.out.println("1.전화");
			}else if(call==true) {
				System.out.println("1.음성 발신");
			}
			if(VERSION>=2 &&dmb==false&&call==false) {	//버전2
				System.out.println("2.DMB 방송 켜기");
			}else if(VERSION>=2 &&dmb==true) {
				System.out.println("2.DMB 방송 끄기");
			}else if(VERSION==1 &&call==false){
				System.out.println("2.핸드폰 Off");
			}else if(call==true) {
				System.out.println("2.음성 수신");
			}
			if(VERSION>=3 && internet==false) {//버전 3
				System.out.println("3.인터넷 켜기");
			}else if((VERSION>=3 && internet==true)) {
				System.out.println("3.인터넷 끄기");
			}else if(VERSION==2&&call==false){
				System.out.println("3.핸드폰 Off");
			}else if(VERSION==1&&call==true) {
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
			if(status!="") {
				System.out.println("(상태정보 : "+status+")");
			}
			System.out.println("------------------");
			
			
			while(true) {
				try {
					System.out.print("\n번호를 입력하세요:");
					input = Integer.parseInt(sc.nextLine());
					break;
				} catch (Exception e) {}
			}
			
			switch(input){
			case 0:
				if(VERSION>1&&call==true) {
					System.out.println("전화를 종료합니다.\n");
					call=false;
					status="";
				}
				break;
			case 1:
				if(call==false) {	//버전 1
					call=true;
					status="통화중";
				}else if(call==true) {
					dao.messageSend();
				}
				break;
			case 2:
				if(VERSION>=2 &&dmb==false) {	//버전2
					if(call==true) {
						System.out.println("통화중에는 dmb사용이 불가합니다.\n");
					}else {
						System.out.println("dmb를 켭니다.\n");
						dmb=true;
					}
				}else if(VERSION>=2 &&dmb==true) {
					System.out.println("dmb를 종료합니다.\n");
					dmb=false;
				}else if(VERSION==1&&call==false){
					System.out.println("핸드폰을 종료합니다.\n");
					phone=false;
					break;
				}else if(call==true) {
					dao.messageReceive();
				}
				break;
			case 3:
				if(VERSION>=3 && internet==false) {//버전 3
					System.out.println("인터넷을 켭니다.\n");
					internet=true;
					status+="인터넷 사용 중";
				}else if((VERSION>=3 && internet==true)) {
					System.out.println("인터넷을 끕니다.\n");
					internet=false;
				}else if(VERSION==2){
					System.out.println("핸드폰을 종료합니다.\n");
					phone=false;
					break;
				}else if(VERSION==1&&call==true) {
					System.out.println("전화를 종료합니다.\n");
					call=false;
					status="";
				}
				break;
			case 4:
				if(VERSION>=3 && webtoon==false) {
					if(internet==false) {
						System.out.println("인터넷이 꺼져있어 웹툰을 볼 수 없습니다.");
					}else {
						System.out.println("웹툰을 켭니다.");
						webtoon=true;
					}
				}else if(VERSION>=3 && webtoon==true){
					System.out.println("웹툰을 끕니다.\n");
					webtoon=false;
				}
				break;
			case 5:
				if(VERSION>=3) {
					System.out.println("핸드폰이 종료됩니다.");
					phone=false;
					break;
				}
				break;
			default:
				System.out.println("번호를 다시 입력해 주세요.");
				break;
			}
			
		}
		
	}
	 
	
}
}
