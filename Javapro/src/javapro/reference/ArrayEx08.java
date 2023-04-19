package javapro.reference;

public class ArrayEx08 {

	public static void main(String[] args) {
		/* 조건.
		 * 1. 첫행에 중간열에 1을 넣는다.
		 * 2. 대각선 오른쪽 위로 이동한다.
		 * 3. 행이 존재하지 않을 경우 마지막 행에 다음 값을 넣는다.
		 * 4. 열이 존재하지 않을 경우 첫 열에 다음 값을 넣는다.
		 * 5. 이미 값이 존재할 경우에는 행+2,열-1 위치로 이동한우 다음 값을 넣는다.
		 * 6. 행과 열이 모두 존재하지 않을 경우 행+2, 열-1 위치로 이동한 후 다음 값을 넣는다. 
		 * 7. 2번을 반복한다.
		 */
		int[][] magic = new int[3][3];
		int row,col; //row(행) col(열)
		int num = 1; //값
		row = 0; //첫 행
		col = magic[0].length/2; //중간열 
		magic[row][col] = num; // 첫행 중간열에 1을 넣는다.(조건1)
		for(num=2; num<=magic.length*magic[0].length; num++) { // (조건7) 
			//↓ 23,24줄 = 대각선 위로 이동 (조건2)
			row--;
			col++;
			//조건6을 제일 위에 쓰는 이유 : 조건3 && 조건4 를 묻기때문에.
			//조건3,조건4 = 하나의 if(조건)을 묻기에 조건 6이 밑에 나오면 조건3,조건4의 if문이 먼저 수행되기 때문에.
			if(row<0 && col == magic[0].length) { //행과 열이 모두 존재하지 않을경우 (조건6)
				row += 2; //행+2 (조건6) 
				col --; //열-1 (조건6)
			}
			if(row<0) { //행이 존재하지 않을 경우의 조건. (조건3)
				row = magic.length - 1; // 마지막 행 (조건3)
			}
			if(col == magic[0].length) { //열이 존재하지 않을 경우의 조건.(조건4)
				col = 0; // 첫 열 (조건4)
			}
			if(magic[row][col] != 0) { //이미 값이 존재할 경우의 조건. (조건5)
				row += 2; // 행+2 (조건5)
				col --; //열-1 (조건5)
			}
			
			magic[row][col]=num;
		} //for
		// 행과열처럼 마방진 출력하기.
		for(int i=0; i<magic.length; i++) {
			for(int j=0; j<magic[i].length; j++) {
				System.out.print(magic[i][j] + " ");
			}
			System.out.println();
		}
	}

}
