package javapro.thread;

import java.awt.Toolkit;

public class ThreadEx01 {

	public static void main(String[] args) {
		/*Thread thread = new Thread(new Runnable() {

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
				}
			}
		});*/
		Thread thread = new Thread(() -> {
			Toolkit tkit = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				tkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}