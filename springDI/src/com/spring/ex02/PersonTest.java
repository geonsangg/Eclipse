package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonInformation information = (PersonInformation)factory.getBean("personInfo");
		information.info();
		System.out.println("===================");
		PersonInformation infoformation2 = (PersonInformation)factory.getBean("personInfo2");
		infoformation2.info();
	}

}
