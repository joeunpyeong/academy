package test01_oop1;

public class DrinkMain {
	public static void main(String[] args) {
		// 반복을 계속해서 하다가 별도의키를 입력받아 종료되야함.
		// DrinkDTO dto = //null , 0 , 0 <= 초기값만 있음.
		DrinkDAO dao = new DrinkDAO();
		//DrinkDTO[] drinkArr = dao.initDrinks();// 음료3개가 있는 배열을 return 받음

		while (true) {
			dao.display();
			System.out.println("0.관리자모드,1.음료주문 , -1.종료");
			int inputMenu = dao.inputInt();
			if(inputMenu == 0) {
				System.out.println("관리자모드를 실행합니다.");
				System.out.println("보안 규칙에 따라 관리자 로그인을 해주세요.");
				AdminDAO aDao = new AdminDAO();
				if(aDao.adminLogin()) {
					System.out.println("1.음료추가 2.음료수정 3.음료삭제 -1.메인메뉴로 이동");
					inputMenu = dao.inputInt();
					if(inputMenu==1) {
						aDao.addMenu(dao);
					}else if(inputMenu==2) {
						
					}else if(inputMenu==3) {
						
					}else if(inputMenu==-1) {
						
					}else {
						System.out.println("잘못입력하셨습니다. 메인메뉴로 이동합니다.");
					}
					
				}
			}
			if (inputMenu == 1) {
				System.out.println("돈을 넣어주세요.");
				int money = dao.inputMoney();
				System.out.println("금액 입력 됨 : "+ money);
				while(money != -1) {
					System.out.println("잔돈 : "+money + " 음료 번호를 입력해주세요.");//0~2, 사용자 1~3
					int choice = dao.choiceMenu();
					System.out.println(choice + "번 선택완료");
					money =dao.orderMenu(choice, money);
				}
			} else if (inputMenu == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
