package javapro.thread;

import java.awt.Toolkit;

public class WorkerThread extends Thread {

	@Override
	public void run() {
		Toolkit tkit = Toolkit.getDefaultToolkit();
		for (int i = 1; i <= 5; i++) {
			tkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for
	}// run

}
