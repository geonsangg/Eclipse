package com.mybatis.member2;

import java.io.Reader;
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
	//아이디 조회
	/*public String selectId() {
		sqlMapper=getInstance();
		SqlSession session=sqlMapper.openSession();
		String id=session.selectOne("mapper.member.selectId");
		return id;
	}*/
	public String selectPwd() {
		sqlMapper=getInstance();
		SqlSession session=sqlMapper.openSession();
		String pwd=session.selectOne("mapper.member.selectPwd");
		return pwd;
	}
}
