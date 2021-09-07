package com.shaymee.s4.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shaymee.s4.board.BoardDTO;
import com.shaymee.s4.board.pager.Pager;

@Controller
@RequestMapping("/qna/**")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@ModelAttribute("board") 	// @ModelAttribute에서 ()는 해당 model의 이름, 값(value)은 이 메서드가 return하는 값
	public String getBoard() {	// Model에 board라는 이름으로 모든 메서드에 공통적으로 작동함
		return "qna";
	}

	@GetMapping("list") // 1. url 주소에 /qna/list가 오면 백엔드의 해당메서드로 오고
	public ModelAndView getList(Pager pager) throws Exception {
		List<BoardDTO> ar = qnaService.getList(pager);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/list");  // 2. 작업을 마치고 jsp 경로로 보내버리기
		mv.addObject("pager", pager);
		mv.addObject("list", ar);
		
		return mv;
	}
	
	@GetMapping("select")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		QnaDTO qnaDTO = qnaService.getSelect(boardDTO);
		mv.setViewName("board/select");
		mv.addObject("dto", qnaDTO);
		
		return mv;
	}
	
	@GetMapping("insert")
	public ModelAndView setInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/insert");
		
		return mv;
	}
	
	@PostMapping("insert")
	public String setInsert(BoardDTO boardDTO) throws Exception {
		int result = qnaService.setInsert(boardDTO);
		
		return "redirect:./list";
	}
	
	@GetMapping("delete")
	public String setDelete(BoardDTO boardDTO) throws Exception {
		int result = qnaService.setDelete(boardDTO);
		
		return "redirect:./list";
	}
	
	@GetMapping("update")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		QnaDTO qnaDTO = qnaService.getSelect(boardDTO);
		mv.setViewName("board/update");
		mv.addObject("dto", qnaDTO);
		
		return mv;
	}
	
	@PostMapping("update")
	public String setUpdate(BoardDTO boardDTO) throws Exception {
		int result = qnaService.setUpdate(boardDTO);
		
		return "redirect:./list";
	}
	
	@GetMapping("reply")
	public ModelAndView setReply() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/reply");
		
		return mv;
	}
	
	@PostMapping("reply")
	public ModelAndView setReply(QnaDTO qnaDTO) throws Exception {
		int result = qnaService.setReply(qnaDTO);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	
	
	
	
	
}
