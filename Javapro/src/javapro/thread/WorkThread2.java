package javapro.thread;

public class WorkThread2 extends Thread{
	boolean work = true;
	
	public WorkThread2(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + " 작업처리");
			} else {
				Thread.yield();
			}
		}
	}
	
}
