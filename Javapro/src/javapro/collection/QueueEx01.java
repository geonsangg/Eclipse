package javapro.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		messageQueue.offer(new Message("sendMail", "김철수")); //Queue 에 넣는 메서드 offer
		messageQueue.offer(new Message("sendSMS", "홍길동"));
		messageQueue.offer(new Message("sendKatalk", "이영희"));
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); //앞에 작업이 끝나면 다음껄 실행하는 poll
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에 SMS를 보냅니다.");
				break;
			case "sendKatalk":
				System.out.println(message.to + "님에 카톡을 보냅니다.");
				break;
			}
		}
	}

}
