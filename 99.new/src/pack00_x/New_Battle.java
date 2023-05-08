package pack00_x;

public class New_Battle {
	int hp;
	
	boolean battle() {
		if(hp<=0) {
			System.out.println("체력이 없습니다.");

			return false;
		}else {
			System.out.println("체력이 있습니다.");

			return true;
		}
	}
}
