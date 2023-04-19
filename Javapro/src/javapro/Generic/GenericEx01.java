package javapro.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 50;
		nums[1] = 70;
		System.out.println(nums[0]);
		List list = new ArrayList();  //리스트에 번지가 생성
		list.add("홍길동");            //번지를 찾아가면 또 번지가있음.
		list.add(50);               
		list.add(45.63);
		list.add(false);
		String name =(String)list.get(0); // 캐스팅 하는 이유는 List는 object타입으로 저장되기 때문.
		int number = (int)list.get(1);
		System.out.println(list.get(0));
		//<> = List의 타입을 정하는것.
		List<String> list2 = new ArrayList<String>();
		list2.add("김철수");
		list2.add("이영희");
		list2.add("박찬호");
		list2.remove(1); // list2의 1번째를 제거한다.
		for(int i=0; i<list2.size(); i++) {
			System.out.println("이름 : " + list2.get(i));
		}
		String na = list2.get(0); // list2는 String으로 정해놨으니 캐스팅 필요x;
	}

}
