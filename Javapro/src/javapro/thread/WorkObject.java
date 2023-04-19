package javapro.thread;

public class WorkObject {

	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "=> methodA 작업 실행");
		notify(); //일시 정지 되어있는 다른 스레드를 풀어준다.
		try {
			wait(); //자신의 스레드를 일시정지.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "=> methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
