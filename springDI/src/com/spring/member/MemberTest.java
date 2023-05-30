package com.spring.member;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberTest {

	public static void main(String[] args) {
		// 실행시 member.xml에 설정한 대로 빈을 생성한 후 주입한다.
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("member.xml"));
		MemberService service = (MemberService)factory.getBean("memberService");
		service.listMembers();
	}

}
