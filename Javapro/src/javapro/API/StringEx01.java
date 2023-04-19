package javapro.API;

public class StringEx01 {

	public static void main(String[] args) {
		//StringBuilder = 임시 메모리로 수정 삭제 등 작업후 변수로 넘겨주면 소멸된다.
		StringBuilder sb = new StringBuilder();
		sb.append("우리모두"); //문자 끝에 추가된다.
		sb.append("화이팅");
		System.out.println(sb.toString());
		sb.insert(4, "힘차게"); //4번째 앞에 넣는다.
 		System.out.println(sb);
		sb.setCharAt(7, '파'); //7번째를 바꾼다
		System.out.println(sb);
		sb.replace(4, 7, "아자아자"); // 4번재 부터 7번째 전까지 바꾼다.
		System.out.println(sb);
		sb.delete(8, 11); // 8번재 부터 11번째 전까지 지운다.
		System.out.println(sb);
		//StringBuilder 작업이 끝났으면 변수에 넣는다.
		String result = sb.toString();
		System.out.println(result);
	}

}
