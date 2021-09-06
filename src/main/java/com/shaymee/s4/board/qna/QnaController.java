package com.shaymee.s4.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shaymee.s4.board.BoardDTO;

@Controller
@RequestMapping("/qna/**")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@ModelAttribute("board") 	// @ModelAttribute에서 ()는 해당 model의 이름, 값(value)은 이 메서드가 return하는 값
	public String getBoard() {	// Model에 board라는 이름으로 모든 메서드에 공통적으로 작동함
		return "QnA";
	}

	@GetMapping("list") // 1. url 주소에 /qna/list가 오면 백엔드의 해당메서드로 오고
	public ModelAndView getList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/list");  // 2. 작업을 마치고 jsp 경로로 보내버리기~!
		List<BoardDTO> ar = qnaService.getList();
		mv.addObject("list", ar);
		return mv;
	}
}
