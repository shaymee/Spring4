package com.shaymee.s4.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@GetMapping("mypage")
	public ModelAndView mypage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/mypage");		
		
		return mv;		
	}
	
	@GetMapping("logout")
	public ModelAndView logout(HttpSession session) throws Exception {
		//1. session에 있는 attribute를 아예 없애버리는 방법

		/*
		 * session.removeAttribute("member"); // 속성이름을 "member"로 넣어놨으니 ModelAndView mv =
		 * new ModelAndView(); mv.setViewName("redirect:../");
		 */

		//2. session을 강제로 죽이는 방법(session의 생존시간을 0으로 만드는 방법)
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:../"); //현재 페이지 머물게 하려고 ./ 이렇게 해봄-->이건또 안되네? 왜??
		
		return mv;
	}
	
	
	@PostMapping("login")
	public ModelAndView login(MemberDTO memberDTO, HttpSession session) throws Exception {
//		HttpSession session = request.getSession(); //이렇게 받아도 되긴 하지만 최종적으로 원하는건 Session 객체
													// 그냥 매개변수로 Session 객체를 받자
		
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getLogin(memberDTO);
		if(memberDTO != null) {
			System.out.println("로그인 성공");
			session.setAttribute("member", memberDTO); //Model에 집어넣는 것처럼 얘도 집어넣을 수 있음
														//응답,요청과 상관없이 일정시간이 지날때까지 계속 살아있음
		} else {
			System.out.println("로그인 실패");
		}
		
		mv.setViewName("redirect:../"); // home은 만들어놓은게 있으니까 redirect로 가야함
		
		/** forward와 redirect의 차이점 설명(home.jsp에 memberDTO 정보 못보내는 건에 대한 설명)
		 	
		 */
		
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
	
	@PostMapping("join")
	public ModelAndView join(MemberDTO memberDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result= memberService.setJoin(memberDTO);
		
		String message = "회원가입 실패";
		if(result>0) {
			message="회원가입 성공";
		}
		
		mv.addObject("msg", message);
		mv.addObject("url", "../");
		mv.setViewName("common/result");
		
		return mv;
	}
	
	@GetMapping("delete")
	public ModelAndView setDelete(HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		int result = memberService.setDelete(memberDTO);
		session.invalidate();//강제 로그아웃
		mv.setViewName("redirect:../");//OR redirect:../logout
		
		return mv;
	}
	
	@PostMapping("update")
	public ModelAndView setUpdate(MemberDTO memberDTO, HttpSession session) throws Exception{
		//수정 전 데이터
		MemberDTO sessionDTO = (MemberDTO)session.getAttribute("member");
		//memberDTO가 수정 후 dto
		memberDTO.setId(sessionDTO.getId());
		ModelAndView mv=new ModelAndView();
		int result = memberService.setUpdate(memberDTO);
		
		memberDTO.setName(sessionDTO.getName());
		
		session.setAttribute("member", memberDTO);//똑같은이름으로 덮어씌워 갈아치기
		
		mv.setViewName("redirect:../");
		
		return mv;
	}
	
	@GetMapping("update")
	public ModelAndView setUpdate() throws Exception{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("member/update");
		
		return mv;
	}

}
