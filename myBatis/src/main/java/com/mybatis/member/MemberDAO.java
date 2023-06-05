package com.mybatis.member;

import java.io.Reader;
import java.util.List;
import java.util.Map;

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
				String resource="mybatis/SqlMapConfig.xml";
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
	public List<MemberVO> selectAllMemberList(){
		sqlMapper=getInstance();//db가져오기
		//실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession객체를 가져옴
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> memList=null;
		memList=session.selectList("mapper.member.selectAllMemberList");
		return memList;
	}
	//회원등록 메서드
	public void insertMember(MemberVO memberVO) {
		sqlMapper=getInstance();//db가져오기
		//실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession객체를 가져옴
		SqlSession session=sqlMapper.openSession();
		session.insert("mapper.member.insertMember",memberVO);
		session.commit();
	}
	public void insertMember2(Map<String, String> memberMap) {
		sqlMapper=getInstance();//db가져오기
		//실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession객체를 가져옴
		SqlSession session=sqlMapper.openSession();
		session.insert("mapper.member.insertMember2",memberMap);
		session.commit();
	}
	
	//ID로 회원 검색 메서드
	public MemberVO selectMemberById(String id) {
		sqlMapper=getInstance();//db가져오기
		SqlSession session=sqlMapper.openSession();
		MemberVO memberVO = session.selectOne("mapper.member.selectMemberById",id);
		return memberVO;
	}
	
	//회원 수정 메서드
	public void updateMember(MemberVO memberVO) {
		sqlMapper=getInstance();//db가져오기
		SqlSession session=sqlMapper.openSession();
		session.update("mapper.member.updateMember", memberVO);
		session.commit();
	}
	
	//회원 삭제 메서드
	public void delMember(String id) {
		sqlMapper=getInstance();//db가져오기
		SqlSession session=sqlMapper.openSession();
		session.delete("mapper.member.delMember", id);
		session.commit();
	}
	
	//동적 조회 메서드
	public List<MemberVO> searchMember(MemberVO memberVO) {
		sqlMapper=getInstance();//db가져오기
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> list = session.selectList("mapper.member.searchMember", memberVO);
		return list;
	}
	
	//foreach 태그 활용 메서드
	public List<MemberVO> foreachSelect(List<String> nameList) {
		sqlMapper=getInstance();//db가져오기
		SqlSession session=sqlMapper.openSession();
		List<MemberVO> list = session.selectList("mapper.member.foreachSelect", nameList);
		return list;
	}
}
