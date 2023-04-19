package javapro.thread;

public class UserThread2 extends Thread {
	private Calculator calculator;

	public UserThread2() {
		setName("UserThread2");
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
