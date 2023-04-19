package javapro.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberEx01 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		set.add(new Member("홍길동", 50));
		set.add(new Member("김철수", 25));
		set.add(new Member("이영희", 25));
		set.add(new Member("홍길동", 50)); // set인데 4명으로 나오는 이유는 객체생성으로 했기에 번지로 들어가서.
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()){
			Member member = iterator.next();
			System.out.println("이름 : " + member.name + ", 나이 : " + member.age);
		}
		System.out.println("총 인원수 : " + set.size());
	}

}
