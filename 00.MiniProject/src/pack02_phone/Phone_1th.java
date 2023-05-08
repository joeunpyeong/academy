package pack02_phone;

import java.util.Scanner;

public class Phone_1th {
	static int VERSION=1;
	public static void main(String[] args) {
		PhoneDAO dao = new PhoneDAO();
		PhoneDTO dto = new PhoneDTO();
		Scanner sc = new Scanner(System.in);
		int input=0;
		System.out.println("1세대 폰");
		while(true) {
		
			while(true) {
				try {
					System.out.println("이니셜 1의 전원을 켜시겠습니까?\n 1.전원ON 2.전원OFF");
					input = Integer.parseInt(sc.nextLine());
					if(input==1) {
						break;
					}else if(input==2) {
						continue;
					}
				} catch (Exception e) {
					System.out.println("선택지를 입력해주세요.");
				}
				
			}
			
			PhoneDAO.mainDisplay(VERSION); 
			System.out.print("\n입력 : ");
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.print("혼잣말 하지 마시고 ");
			}
		}
		
	}
}
