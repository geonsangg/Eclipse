package javapro.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {		
		
		//배열 (크기 고정)
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		//컬렉션 (크기 가변)
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,80); // 80이 1번째로 들어가고 20이 2번째,30이 3번째로 밀려난다.
		list.remove(2); // 2번째가 삭제되고 3번째가 2번째로 당겨진다.
		list.set(1, 50); //1번째가 80이 없어지고 50이 들어옴.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
