package javapro.collection;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>(); //스택은 FILO (fist in last out)
		coinBox.push(new Coin(100)); //스텍에 넣는 메서드 push
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { //isEmpty = 비어있느냐
			Coin coin = coinBox.pop(); //스텍에 넣은 걸 꺼내는 메서드 pop
			System.out.println("꺼내온 동전 :" + coin.getValue() + "원");
		}
	}

}
