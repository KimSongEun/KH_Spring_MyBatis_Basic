package com.mycompanny.morning.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompanny.morning.member.model.dao.MemberDao;
import com.mycompanny.morning.member.model.vo.Member;


@Service("memberService")
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public List<Member> selectMembers(){
		return memberDao.selectMembers();
	}
}
