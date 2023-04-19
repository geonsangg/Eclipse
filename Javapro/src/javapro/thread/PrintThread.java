package javapro.thread;

public class PrintThread extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행중~~~");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}

}
