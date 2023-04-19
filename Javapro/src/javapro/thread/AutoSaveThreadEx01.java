package javapro.thread;

public class AutoSaveThreadEx01 {

	public static void main(String[] args) {
		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true); //감싸고 있는 주 스레드가 끝나면 같이 끝남
		autoSave.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=1;
		}
		System.out.println("1부터 100까지의 합 = " + sum);
	}

}
