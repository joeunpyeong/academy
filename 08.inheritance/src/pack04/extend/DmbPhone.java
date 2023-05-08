package pack04.extend;

public class DmbPhone extends CellPhone{
	//1세대의 기능이 전부 사용 가능하며 +로 Dmb기능이 추가된 최신폰
	int channel;//Dmb기능 사용 시 채널을 의미하는 변수
	//생성자 메소드를 만드는데 색상 모델,체널이 입력되어야지만 생성이 가능하게 해보기

	public DmbPhone(int channel, String color, String model) {
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB방송 수신 시작");
	}
	//changeChannel이라는 메소드를 만드는데, 사용자가 파라메터로 넘겨준 체널로 변경 후
	//DMB방송 수신 시작이 되려면 어떻게 구현하면 좋을까?
	void changeChannel(int channel) {
		this.channel=channel;
		turnOnDmb();
	}
	
	void turnOffDmb() {
		System.out.println("방송 수신 종료");
	}
	



}