package javapro.thread;

public class AutoSaveThread extends Thread{

	//메서드
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			save();
		} //while
	}
	
}
