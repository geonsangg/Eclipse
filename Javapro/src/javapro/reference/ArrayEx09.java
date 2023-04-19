package javapro.reference;

public class ArrayEx09 {

	public static void main(String[] args) {
		/*문제) 1반 성적 총점 = ?
		 *    1반 성적 평균 = ?
		 *    2반 성적 총점 = ?
		 *    2반 성적 평균 = ?*/
		int[][] scores = {
				{96,85,90,60},   //1반
				{70,86,66,82,75} //2반
		};
		double avg;
		for(int i=0; i<scores.length; i++) { // 행을 담당
		int	sum=0; //j for문이 끝나면 다시 sum = 0
			for(int j=0; j<scores[i].length; j++) { // 열을 담당
				sum += scores[i][j];
			}
			avg =(double) sum / scores[i].length;
			System.out.println((i+1) + "반 성적 총점 = " + sum );
			System.out.println((i+1) + "반 성적 평균 = " + avg );
		}
	}

}
