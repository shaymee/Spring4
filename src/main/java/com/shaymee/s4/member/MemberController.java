package com.shaymee.s4.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/member/**")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("login")
	public ModelAndView login(MemberDTO memberDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getLogin(memberDTO);
		if(memberDTO != null) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		mv.setViewName("redirect:../"); // home은 만들어놓은게 있으니까 redirect로 가야함
		
		return mv;
	}
	
	@GetMapping("login") // ** Getmapping으로 받아주는건 jsp로 가는거고 jsp에서 받는건 PostMapping으로!!
	public ModelAndView login() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/login");
		
		return mv;
	}
	
	@GetMapping("idCheck")
	public ModelAndView getIdCheck(MemberDTO memberDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getIdCheck(memberDTO);
		System.out.println("id중복체크 : "+memberDTO);
		mv.addObject("dto", memberDTO);
		mv.setViewName("member/idCheck");	
		
		return mv;
	}
	
	///약관 동의///
	@GetMapping("check")
	public ModelAndView check() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/check");
		
		return mv;
	}
	
	@GetMapping("join")
	public ModelAndView join() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/join");
		
		return mv;
	}
	

}
