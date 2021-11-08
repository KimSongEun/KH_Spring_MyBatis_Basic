package com.mycompanny.morning.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompanny.morning.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;

	public List<Member> selectMembers() {
		return sqlSession.selectList("Member.listMember");
	}
}
