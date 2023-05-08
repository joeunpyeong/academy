package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		//RemoteControl == 인터페이스(방법만 써 놓은 것)
		//Audio 방법을 상속받아 실제 메소드를 구현해 놓은 곳
		Audio ad=new Audio();
		ad.turnOn();
		ad.turnOff();
		ad.setVolume(5);//인터페이스 부분을 이용해서 adio의 최소 볼륨과 최대 볼륨을 기입해주면 좋음
	
		Television tv=new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(5);
		//다향성:인터페이스르르 상속받은 객체 Audio&Telvision은 공통적으로 turnOn,turnOff,setVolume
		//을 가지고 있음
		//따라서  RemoteControl(Interface)==Audio==Television
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0]=new Television();
		rcArr[1]=new Audio();
		for (int i = 0; i < rcArr.length; i++) {
			rcArr[i].turnOn();
		}
	}
}
