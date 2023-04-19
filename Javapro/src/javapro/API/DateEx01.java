package javapro.API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		Date now = new Date(); // 지금 컴퓨터에 요일,월,일,시간,분,초,나라표준시,년을 now에 넣어줌
		System.out.println(now);
		SimpleDateFormat sdf;
		//" " 안에 포멧 형식기호(yyyy,MM등등)를 제외하고 표기한다.
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); //MM=달 mm=분 HH=24시간기준 hh=12시간기준
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일"); //a = 오전 오후 표시. E = 월,화,수 등등;
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 D번째 날입니다."); // D = 1월1일 부터 몇번째 날인지.
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("이번주는 MM월의 W번째 주입니다."); //W = 그 월의 주
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("이번주는 yyyy년의 w번째 주입니다."); //w = 그 년의 주
		System.out.println(sdf.format(now));
		
	}

}
