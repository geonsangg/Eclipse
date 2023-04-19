package javapro.thread;

import java.awt.Toolkit;

public class ThreadEx03 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
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
		}).start();
		
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
