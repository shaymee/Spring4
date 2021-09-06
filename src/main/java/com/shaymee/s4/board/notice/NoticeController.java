package com.shaymee.s4.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shaymee.s4.board.BoardDTO;
import com.shaymee.s4.board.pager.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@ModelAttribute("board")	// 아주 신박한 기능이구나....!
	public String getBoard() { //모든 모델에 동일하게 담아준다. 어떤 이름으로? "board"라는 이름으로
		return "notice";
	}
	
	
//	@RequestMapping(value="list", method = RequestMethod.GET) // URL주소와 메서드형식은 필수!, RequestMapping을 줄인게 @GetMapping("요청주소"), @PostMapping("요청주소")
	
	@GetMapping("list")
	public ModelAndView getList(Pager pager) throws Exception {
		
		List<BoardDTO> ar = noticeService.getList(pager);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/list");
		mv.addObject("pager", pager);
		mv.addObject("list", ar);
		
		return mv; // (tip!!)Controller에서 리턴 안하면 jsp 경로까지 안감
	}
	
	@GetMapping("select")
	public ModelAndView getSelect(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		NoticeDTO noticeDTO = noticeService.getSelect(boardDTO);
		mv.setViewName("board/select");
		mv.addObject("dto", noticeDTO);
		
		return mv;
	}
	
	@GetMapping("insert")
	public ModelAndView setInsert() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/notice/noticeInsert");
		
		return mv;
	}
	
	@PostMapping("insert")
	public String setInsert(BoardDTO boardDTO) throws Exception {
		int result = noticeService.setInsert(boardDTO);
		
		return "redirect:./list";
	}
	
	@GetMapping("delete")
	public String setDelete(BoardDTO boardDTO) throws Exception {
		int result = noticeService.setDelete(boardDTO);
		
		return "redirect:./list";
	}
	
	@GetMapping("update")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		NoticeDTO noticeDTO = noticeService.getSelect(boardDTO);
		mv.setViewName("board/notice/noticeUpdate");
		mv.addObject("dto", noticeDTO);
		
		return mv;
	}
	
	@PostMapping("update")
	public String setUpdate(BoardDTO boardDTO) throws Exception {
		int result = noticeService.setUpdate(boardDTO);
		
		return "redirect:./list";
	}
	
	
	
	
	
	
}
