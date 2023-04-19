package javapro.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		//<String, Integer> map = new Hashtable<>(); - 스레드 환경
		Map<String, Integer> map = new HashMap<>();
		map.put("김철수", 85);
		map.put("홍길동", 60);
		map.put("이영희", 90);
		map.put("박찬호", 80);
		map.put("이영표", 72);
		System.out.println("총 응시자 수 : " + map.size());
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요-> ");
		String name = sc.next();
		System.out.println("점수 : " + map.get(name));
		System.out.println("** 성적 현황표 **");
		System.out.println(" 이름    점수");
		Set<String> key = map.keySet(); //맵의 키들만 key변수에 넣음.
		Iterator<String> iterator = key.iterator();
		while(iterator.hasNext()) { 
			String na = iterator.next();
			Integer score = map.get(na);
			System.out.println(na + "    " + score);
		}//while
		map.remove("이영희");
		System.out.println("==================");
		System.out.println("** 수정된 성적 현황표**");
		System.out.println(" 이름    점수");
		Set<Entry<String, Integer>> setEntry = map.entrySet(); //맵의 키와 값둘다 setEntry에 넣음.
		Iterator<Entry<String, Integer>> entryIterator = setEntry.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String nameKey = entry.getKey();
			Integer scoreValue = entry.getValue();
			System.out.println(nameKey + "    " + scoreValue);
		}
	}

}
