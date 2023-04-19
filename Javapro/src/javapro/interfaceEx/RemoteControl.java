package javapro.interfaceEx;

public interface RemoteControl {
	int MIN_VOLUME = 0; //자동으로 상수로 된다.
	int MAX_VOLUME = 10;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//디폴트 메서드 (인터페이스에서 default를 안쓰면 추상메서드가 된다)
	default void setMute(boolean mute) {
		if(mute) { //true일 경우 수행
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else { // false일 경우 수행
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메서드
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
