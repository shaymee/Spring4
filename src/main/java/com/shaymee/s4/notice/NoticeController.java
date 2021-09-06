package com.shaymee.s4.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shaymee.s4.util.NoticePager;

@RequestMapping("/notice/*")
@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	///// DELETE /////
	@RequestMapping(value="noticeDelete")
	public String delete(NoticeDTO noticeDTO) {
		int result = noticeService.setDelete(noticeDTO);
		
		return "redirect:./noticeList";
	}
	
	///// INSERT /////
	@RequestMapping(value="noticeInsert", method=RequestMethod.GET)
	public void insert() {}
	
	@RequestMapping(value="noticeInsert", method = RequestMethod.POST)
	public String insert(NoticeDTO noticeDTO) {
		int result = noticeService.setInsert(noticeDTO);
		
		return "redirect:./noticeList";
	}
	
	///// LIST /////
	@RequestMapping(value="noticeList")
	public ModelAndView list(ModelAndView mv, NoticePager pager) {
		List<NoticeDTO> ar = noticeService.getList(pager);
		mv.addObject("pager", pager);
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
	}
	
	//// SELECT ////
	@RequestMapping(value="noticeSelect")
	public void select(NoticeDTO noticeDTO, Model model) {
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("dto", noticeDTO);
	}
	
	///// UPDATE /////
	@RequestMapping(value="noticeUpdate", method = RequestMethod.GET)
	public ModelAndView update(NoticeDTO noticeDTO) {
		noticeDTO = noticeService.getSelect(noticeDTO);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("notice/noticeUpdate");
		mv.addObject("dto", noticeDTO);
		
		return mv;
		
	}
	
	@RequestMapping(value="noticeUpdate", method=RequestMethod.POST)
	public ModelAndView update(NoticeDTO noticeDTO, ModelAndView mv) {
		int result = noticeService.setUpdate(noticeDTO);
		mv.setViewName("redirect:./noticeList");
		
		return mv;
	}
	
}
