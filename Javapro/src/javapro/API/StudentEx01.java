package javapro.API;

public class StudentEx01 {

	public static void main(String[] args) {
		Student st1 = new Student(1, "김철수");
		Student st2 = new Student(1, "김철수");
		if (st1.hashCode() == st2.hashCode()) {
			if (st1.equals(st2)) {
				System.out.println("같은 학생입니다.");
			} else {
				System.out.println("데이터가 틀리므로 다른 학생입니다.");
			}
		}else {
			System.out.println("해시코드가 다르므로 다른 학생입니다.");
		}

	}

}
