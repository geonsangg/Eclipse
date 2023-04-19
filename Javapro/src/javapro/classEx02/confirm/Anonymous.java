package javapro.classEx02.confirm;

public class Anonymous {
	// Vehicle 인터페이스를 활용하는 부분들.
	// 필드
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};

	void method1() {
		// 메서드 로컬변수
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
			System.out.println("승용차가 달립니다.");	
			}
		};
		localVar.run();
	}

	// 메서드의 매개변수
	void method2(Vehicle v) {
		v.run();
	}
}
