package javapro.statement;

public class ForEx11 {

	public static void main(String[] args) {
		//라벨 : 원하는단어 에 : 를 붙인다. 반복문이 여러게 일 때 break 할때 전체를 빠져 나오고 싶을 때 사용.
		Outer:for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower); 
				if(lower=='f') {
					break Outer;
				}
			}//for
		}//for

	}

}
