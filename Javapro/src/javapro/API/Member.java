package javapro.API;

public class Member { //Object라는 클래스는 모든 클래스의 부모.
	String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member target = (Member) obj;
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
