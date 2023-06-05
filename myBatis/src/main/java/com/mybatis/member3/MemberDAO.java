package com.mybatis.member3;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	private static SqlSessionFactory sqlMapper=null;
	public static SqlSessionFactory getInstance() {
		if(sqlMapper ==null) {
			try {
				//밑 세줄이 DB연결
				String resource="myBatis/SqlMapConfig.xml";
				Reader reader=Resources.getResourceAsReader(resource);
				sqlMapper=new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			}catch (Exception e) {
				System.out.println("DB연결 중 에러");
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	//회원정보 목록 메서드
	public List selectAllMemberList(){
		sqlMapper=getInstance();//db가져오기
		//실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession객체를 가져옴
		SqlSession session=sqlMapper.openSession();
		List<HashMap<String, String>> memList=null;
		memList=session.selectList("mapper.member.selectAllMemberList");
		return memList;
	}
}
