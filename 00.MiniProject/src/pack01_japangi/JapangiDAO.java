package pack01_japangi;

import java.util.Scanner;

class UI {
	static Scanner sc;
	static JapangiDAO japangi;
	static int input;
	
	static void init(JapangiDTO[] data) {
		sc = new Scanner(System.in);
		japangi = new JapangiDAO(data);
	}
	
	static void insertMoneyDisplay() {//기능1.금액을 입력받는다
		System.out.print("돈을 넣어주세요 : ");
		try {
			input = Integer.parseInt(sc.nextLine());
			if(input==0) {
				return;
			}else if(input<0) {
				System.out.println("돈을 털어가지 마세요\n");
				input=0;
				return;	
			}
		} catch (Exception e) {
			System.out.println("입력 오류\n");
			return;
		}
		
		if (japangi.insertMoney(input)) {
			System.out.println("현재 금액 : "+japangi.getMoney()+"원\n");
		} else {
			System.out.println("장난치지마세요.\n");
		}
	}
	
	static void popDrinkDisplay() {//기능2.음료 뽑기
		System.out.println(japangi.getDrinkList());
		System.out.print("구매 할 음료 번호 입력 : ");
		try {
			input = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("입력 오류\n");
			return;
		}
		
		if (japangi.popDrink(input)) {
			System.out.println("음료를 가져가세요.\n");
		} else {
			System.out.println("음료를 구매 할 수 없습니다.\n");
		}
		System.out.println(japangi.getDrinkList());
	}
	
	static void adminLoginDisplay() {//관리자 로그인 화면
		String id, pw;
		System.out.print("      ID 입력 : ");
		id = sc.nextLine();
		System.out.print("Password 입력 : ");
		pw = sc.nextLine();
		
		if (japangi.adminLogin(id, pw)){
			System.out.println("~로그인 성공~\n");
		} else {
			System.out.println("~로그인 실패~\n");
		}
	}
	
	static void exitDisplay() {//기능3.자판기 종료
		System.out.println(japangi.returnCharge());
		System.out.println("자판기를 종료합니다.");
	}

	static void addDrinkDisplay() {//음료수 추가 display
		String name;
		int price = 0, amount = 0;
		
		System.out.print("음료 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("음료 가격 입력 : ");
		try {
			price = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}
		System.out.print("음료 수량 입력 : ");
		try {
			amount = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}
		
		JapangiDTO newDrink = new JapangiDTO(name, price, amount);
		
		japangi.addDrink(newDrink);
		
		System.out.println("성공적으로 추가했습니다.\n");
		System.out.println(japangi.getDrinkList());
	}
	
	static void modifyDrinkDisplay() {//음료 수정 display
		String name;
		int price = 0, amount = 0;

		System.out.print(japangi.getDrinkList());
		System.out.print("수정할 음료 입력 : ");
		try {
			input = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}
		
		System.out.print("음료 이름 입력 : ");
		name = sc.nextLine();
		System.out.print("음료 가격 입력 : ");
		try {
			price = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}
		System.out.print("음료 수량 입력 : ");
		try {
			amount = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}
		
		JapangiDTO newDrink = new JapangiDTO(name, price, amount);
		
		if (japangi.modifyDrink(input, newDrink)) {
			System.out.println("수정에 성공했습니다.");
		} else {
			System.out.println("수정에 실패했습니다.");
		}
		System.out.println(japangi.getDrinkList());
	}
	
	static void deleteDrinkDisplay() {//음료 삭제 display
		System.out.println(japangi.getDrinkList());
		System.out.print("삭제할 음료 입력 : ");
		
		try {
			input = Integer.parseInt(sc.nextLine());
			if(input<=0) {
				System.out.println("번호를 정확히 입력해 주세요.");
			}
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}
		
		if (japangi.deleteDrink(input)) {
			System.out.println("삭제에 성공했습니다");
		} else {
			System.out.println("삭제에 실패했습니다");
		}
		System.out.println(japangi.getDrinkList());
	}
	
	static boolean mainMenuDisplay(){//메인 화면 display
		System.out.println("-------------------------");
		if(japangi.getAuth()) {
			System.out.println("       관리자 모드\n");
		}else {
			System.out.println("       음료 자판기\n");	
		}
		System.out.print("1. 돈 추가\n2. 음료수 뽑기\n3. 종료\n");
		if (japangi.getAuth()) {
			System.out.println("4. 음료 추가\n5. 음료 수정\n6. 음료수 삭제");
		} else {
			System.out.println("4. 관리자 인증");
		}
		System.out.print("--------------------------\n입력 : ");
		
		try {
			input = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("문자 또는 공백이 포함되어 있습니다.");
		}

		switch(input)
		{
		case 1:
			insertMoneyDisplay();
			break;
		case 2:
			popDrinkDisplay();
			break;
		case 3:
			exitDisplay();
			return false;
		case 4:
			if (japangi.getAuth()) { 
				addDrinkDisplay();
			}
			else {
				adminLoginDisplay();
			}
			break;
		case 5:
			if (japangi.getAuth()) { 
				modifyDrinkDisplay();
				break;
			}
		case 6:
			if (japangi.getAuth()) { 
				deleteDrinkDisplay();
				break;
			}
		default:
			System.out.println("선택지의 번호를 정확히 입력해 주세요.\n");
			break;
		}
		return true;
	}
}

public class JapangiDAO {
	private boolean auth;
	private int money;
	private JapangiDTO data[];

	public boolean getAuth() {
		return auth;
	}
	
	public int getMoney() {
		return money;
	}
	
	public String splitBy(int unit, int money) {//잔돈 동전 세기
		int amount = 0;
		while(money >= unit) {
			money -= unit;
			amount++;
		} 
		if (amount == 0) {
			return "";
		}
		else{
			return unit+"원 "+amount+ "개 ";
		}
	}
	
	public String returnCharge() {//잔돈 반환
		String ret = ""; 

		ret += splitBy(1000, money); 
		ret += splitBy(500, money % 1000);
		ret += splitBy(100, money % 500);
		ret += splitBy(50, money % 100);
		ret += splitBy(10, money % 50);
		
		if (!ret.equals("")) {
			ret += "를 반환하였습니다.\n";
		} else {
			ret = "드릴 돈이 없네요.\n";
		}
		
		return ret;
	}

	public JapangiDAO(JapangiDTO data[]) {
		this.auth = false;
		this.money = 0;
		this.data = data;
	}
	
	public boolean insertMoney(int money) {//돈 넣기
		if (money % 10 == 0) {
			this.money += money;
			return true;
		}
		return false;
	}
	
	public boolean popDrink(int srcNum) {//음료 계산
		srcNum--;
    	if(srcNum >= 0 && srcNum <data.length)
    		if (data[srcNum].drinkPrice <= money && data[srcNum].inv != 0) {
        		money -= data[srcNum].drinkPrice;
        		data[srcNum].inv--;
                return true;
        	}
    	return false;
	}
	
	public boolean adminLogin(String id, String pw) {//관리자 id pw 비교
		if(id.equals("master") && pw.equals("master1234")) {
			auth=true;
			return true;
		}else {
			auth=false;
			return false;
		}
	}

	public void addDrink(JapangiDTO src) {//음료 추가
		if (auth) {
			JapangiDTO newData[] = new JapangiDTO[data.length+1];
			
			for(int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			newData[data.length] = src;
			data = newData;
    	} 
	}
	
	public boolean modifyDrink(int srcNum, JapangiDTO dst) {//음료 수정
		srcNum--;
		if (auth && srcNum >= 0 && srcNum <data.length) {
			data[srcNum] = dst;
			return true;
		}
		return false;
	}
	
	public boolean deleteDrink(int srcNum) {//음료 삭제
		srcNum--;
		if (auth && srcNum >= 0 && srcNum <data.length) {
			int idx = 0;
			JapangiDTO newData[] = new JapangiDTO[data.length-1];
			
			for(int i = 0; i < data.length; i++) {
				if (i == srcNum) continue;
				newData[idx] = data[i];
				idx++;
			}
			data = newData;
    		return true;
    	} else {
    		return false;
    	}
	}
	
	public String getDrinkList() {//음료 리스트
		String res = "";
		System.out.print("\n   음료 리스트");
		for (int i = 0; i < data.length; i++)
		{
			res += (i+1)+"."+data[i].drink+" 가격:"+data[i].drinkPrice+" 수량 :"+data[i].inv+"\n";
		}
		System.out.println("");
		
		return res;
	}
}