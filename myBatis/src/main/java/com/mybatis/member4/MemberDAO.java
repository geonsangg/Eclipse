package com.mybatis.member4;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.member.MemberVO;

public class MemberDAO {
	
	private static SqlSessionFactory sqlMapper = null;  // SqlSessionFactory = 마이바티스에서 제공하는 디비연결 인터페이스
	
	public static SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				String resource = "mybatis/SqlMapConfig.xml";  //디비연결정보가 담긴 폴더/xml
				Reader reader = Resources.getResourceAsReader(resource); //Reader가 안에 소스를 읽어온다.
				sqlMapper = new SqlSessionFactoryBuilder().build(reader); //sqlMapper에 디비 연결정보를 담음 
				reader.close(); 
			}catch (Exception e) {
				System.out.println("DB연결 중 오류");
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	
	//회원 정보 목록 메서드
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance();
		//실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession객체를 가져옴
		SqlSession session = sqlMapper.openSession(); 
		List<MemberVO> memList = null;
		memList = session.selectList("mapper.member.selectAllMemberList");
		return memList;
	}
	
	//아이디로 회원 검색
	   public MemberVO selectMemberById(String id) {
	      sqlMapper=getInstance();
	      SqlSession session=sqlMapper.openSession();
	      MemberVO memberVO=session.selectOne("mapper.member.selectMemberById",id);
	      return memberVO;
	      
	   }
	   
	   //이름으로 회원 검색
	   public List<MemberVO> selectMemberByName(String name){
	      sqlMapper=getInstance();
	      SqlSession session=sqlMapper.openSession();
	      List<MemberVO> membersList=session.selectList("mapper.member.selectMemberByName",name);
	      return membersList;
	   }

	
}
