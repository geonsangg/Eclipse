package javapro.API;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderEx01 {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles"); //그 지역의 시간을 가져온다.
		Calendar now = Calendar.getInstance(tz); //tz를 안쓰면 지금 내 컴퓨터 기준.
		//System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; //Calendar의 달은 0월부터11월로 되어있음.
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); // 일요일=1 월요일은=2 
		String w = "";
		switch(week) {
		case 1: 
			w = "일요일";
			break;
		case 2: 
			w = "월요일";
			break;
		case 3: 
			w = "화요일";
			break;
		case 4: 
			w = "수요일";
			break;
		case 5: 
			w = "목요일";
			break;
		case 6: 
			w = "금요일";
			break;
		case 7: 
			w = "토요일";
			break;
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM); // 0 = 오전 1 = 오후
		String strAmpm = "";
		if(ampm == 0) {
			strAmpm = "오전";
		} else {
			strAmpm = "오후";
		}
		System.out.print("현재 로스엔젤레스는 " + year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 " + w + "이고");
		System.out.print("현재 로스엔젤레스 시간은 " +strAmpm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초입니다.");
		
	}

}
