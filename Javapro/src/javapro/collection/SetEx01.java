package javapro.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); //순서가 없고 중복 저장 안됨.
		set.add("홍길동");
		set.add("이영희");
		set.add("박찬호");
		set.add("홍길동");
		/*for(String name : set) {
			System.out.println("이름 : " + name); 
		}*/
		set.remove("이영희"); //순서가 없기 때문에 값을 입력하면됨.
		Iterator<String> iterator = set.iterator(); // set안에있는 자료를 하나씩 iterator에 가져온다.
		while(iterator.hasNext()) { //자료가 있으면 true
			String name = iterator.next(); // 하나가져와서 넣고 하나가져와서 넣고
			System.out.println("이름 : " + name);
		}
		System.out.println("총인원수 : " + set.size());
	}

}
