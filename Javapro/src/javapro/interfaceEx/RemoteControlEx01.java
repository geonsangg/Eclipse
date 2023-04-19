package javapro.interfaceEx;

public class RemoteControlEx01 {

	public static void main(String[] args) {
		RemoteControl rc; //선언
		Searchable sa;
		rc = new Television(); //RemoteControl로 선언하고 Television으로 생성했으니 다형성.
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		//기본 TV리모콘, 스마트TV리모콘을 2개 가지고 있다고 생각하면 이해하기 쉬움.
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(5);
		sa = new SmartTelevision();
		sa.search("http://www.youtube.com");
		rc.turnOff();
	}

}
