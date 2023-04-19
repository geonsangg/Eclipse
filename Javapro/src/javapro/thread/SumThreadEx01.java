package javapro.thread;

public class SumThreadEx01 {

	public static void main(String[] args) {
		SumThread sumt = new SumThread();
		sumt.start();
		
		try { //join은 스레드가 실행이 끝날 때 까지 다른 스레드를 멈추는 기능.
			sumt.join(); //<- 사용안하면 sumt.start는 스레드, syso는 메인스레드로 따로 실행된다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1부터 100까지의 합 = " + sumt.getSum());
	}

}
