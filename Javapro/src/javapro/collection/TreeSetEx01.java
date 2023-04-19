package javapro.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		for(Integer s: scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95)); 
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점이거나 바로 위 점수 : " + scores.ceiling(85));
		
		NavigableSet<Integer> descscores=scores.descendingSet(); //내림차순
		for(Integer s : descscores) {
			System.out.print(s + " ");
		}
	}

}
