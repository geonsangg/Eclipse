package javapro.thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory1(int memory) { // 매개변수가 들어오면 메서드가 잠긴다.
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "=>" + this.memory);
	}
	
	public void setMemory2(int memory) { 
		synchronized (this) { // <- 이렇게 주면 원하는 곳만 잠군다.
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "=>" + this.memory);
		}
		
	}
	
}
