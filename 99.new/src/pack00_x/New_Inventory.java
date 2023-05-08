package pack00_x;

public class New_Inventory {
	int power, agi, inte, nar, app, hp, money, fame, fullInven=6;
	int[] inven = new int[fullInven];
	
	public New_Inventory(int[] inven, int fullInven,int power, int agi, int inte, int nar, int app, int hp, int money, int fame) {
		this. fullInven =fullInven;
		this.inven = inven;
		this.power = power;
		this.agi = agi;
		this.inte = inte;
		this.nar = nar;
		this.app = app;
		this.hp = hp;
		this.money = money;
		this.fame = fame;
		System.out.println("---------");
		System.out.print("  힘 : "+power);
		System.out.println("민첩 : "+agi);
		System.out.print("지능 : "+inte);
		System.out.println("화법 : "+nar);
		System.out.print("외모 : "+app);
		System.out.println("체력 : "+hp);
		System.out.println("명성 : "+fame);
		System.out.print("보유한 금액 : "+money + "gold");
		System.out.println("---------");
		
		
	}
}
