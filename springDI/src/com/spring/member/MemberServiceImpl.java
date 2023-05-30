package com.spring.member;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO; //주입되는 빈을 저장할 MemberDAO 타입의 속성을 선언
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public void listMembers() {
		memberDAO.listMembers();
	}

}
