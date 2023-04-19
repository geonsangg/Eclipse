package javapro.reference;

public class ArrayEx01 {

	public static void main(String[] args) {
		int scores[] = {75,90,80,66,96,82,74,88,80,71}; //0~9
		int sum = 0;
		int avg;
			for(int i=0; i<scores.length; i++) { //length = 10이기때문에 =은 사용하면 안됨.
				sum += scores[i]; //sum = sum + scores[i]; (처음엔 0번재 75)
				}
			avg = sum / scores.length; // sum / 10
			System.out.println("반 총점 : " + sum);
			System.out.println("반 평균 : " + avg);
	}

}
