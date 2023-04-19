package javapro.thread;

public class WorkObjectEx01 {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		threadA.start();
		threadB.start();

	}

}
