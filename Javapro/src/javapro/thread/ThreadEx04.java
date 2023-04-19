package javapro.thread;

public class ThreadEx04 {

	public static void main(String[] args) {
		Thread cthread = Thread.currentThread(); //현재 스레드의 정보를 넣는다.
		System.out.println(cthread.getName() + "스레드 실행");
		
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() { 
				@Override
				public void run() {
					System.out.println(getName() + "스레드 실행");
				}
			};
			threadA.setName("myThread-" + i); //Thread 이름을 정하지 않으면 Thread-0 이런식으로 만들어짐
			threadA.start();
		}
	}

}
