package com.mycompanny.morning.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompanny.morning.member.model.service.MemberService;


@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

		
	
	@RequestMapping(value = "memberlist", method = RequestMethod.GET)
	public ModelAndView memberlist(ModelAndView mv) {
		mv.setViewName("memberlist");
		mv.addObject("memberlist", memberService.selectMembers());
		return mv;
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("memberlist");
		mv.addObject("memberlist", memberService.selectMembers());
		return mv;
	}
}
