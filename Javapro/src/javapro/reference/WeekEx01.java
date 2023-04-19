package javapro.reference;

import java.util.Calendar;

public class WeekEx01 {

	public static void main(String[] args) {
		Week today = null;
		Calendar now = Calendar.getInstance(); // now = 현재 컴퓨터에 저장되어있는 날짜시간등등.
		int week = now.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}//shitch
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}

	}

}
