package javapro.API;

import java.util.StringTokenizer;

public class StringEx02 {

	public static void main(String[] args) {
		String data = "김철수,이영희,홍길동,박찬호,이영표";
		String[] names = data.split(","); //("&|,|-") = &또는 ,또는 -를 분리자로 쓴다.
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("======================");
		String data2 = "김철수,이영희,홍길동,박찬호,이영표";
		StringTokenizer st = new StringTokenizer(data2,","); //st에 ,로 분리해서 문자를 넣는다.
		while(st.hasMoreTokens()) { // 토큰이 없을때까지 반복
			String name = st.nextToken(); //다음 토큰을 가져와라.
			System.out.println(name);
		}
	}

}
