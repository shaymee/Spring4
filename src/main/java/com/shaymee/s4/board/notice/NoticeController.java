package com.shaymee.s4.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shaymee.s4.board.BoardDTO;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@ModelAttribute("board")	// 아주 신박한 기능이구나....!
	public String getBoard() { //모든 모델에 동일하게 담아준다. 어떤 이름으로? "board"라는 이름으로
		return "Notice";
	}
	
//	@RequestMapping(value="list", method = RequestMethod.GET) // URL주소와 메서드형식은 필수!, RequestMapping을 줄인게 @GetMapping("요청주소"), @PostMapping("요청주소")
	@GetMapping("list")
	public ModelAndView getList() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/list");
		
		List<BoardDTO> ar = noticeService.getList();
		mv.addObject("list", ar);
		
		return mv; // (tip!!)Controller에서 리턴 안하면 jsp 경로까지 안감
		
	}
}
