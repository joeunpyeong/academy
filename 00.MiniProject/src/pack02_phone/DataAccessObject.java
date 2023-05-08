package pack02_phone;

public interface DataAccessObject {

	//-기능1: 전원 켜기 & 끄기 : return 이 없는 기능으로 단순하게 전원이 켜고 꺼지며 , 상태 정보가 변경 된다
    //(ex . 전원 켜기 : 상태 ( 전원 켜짐 ) , 전원 끄기 ( 전원 꺼짐 )
	public void phoneOn();
	public void phoneOff();
	
	//-기능2: 전화 받기 & 끊기 : 객체의 전원 상태 정보가 켜짐이고 전화중이 아닌경우에 전화 받기가 가능하며 
    //전화를 받게 되면 상태 정보는 전화중으로 변경 된다.
    //객체의 상태 정보가 전화중인 경우 전화 끊기가 가능하다.
	public void callReceive();
	public void callQuit();
	
	//-기능3: 음성 전송 & 수신 : 전화중 상태에서만 음성 전송 및 수신이 가능하며 문자열을 입력하여 음성을 전송하고 문자열을
    //입력하여 수신 받는것으로 인식한다.
	public void messageSend();
	public void messageReceive();
	
	
}
