package com.shaymee.s4.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaymee.s4.util.NoticePager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	public int setDelete(NoticeDTO noticeDTO) {
		return noticeDAO.setDelete(noticeDTO);
	}
	
	public int setInsert(NoticeDTO noticeDTO) {
		return noticeDAO.setInsert(noticeDTO);
	}
	
	public List<NoticeDTO> getList(NoticePager pager) {
		pager.makeRow();
		pager.makeNum();
		List<NoticeDTO> ar = noticeDAO.getList(pager);
		return ar;
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO) {
		return noticeDAO.getSelect(noticeDTO);
	}
	
	public int setUpdate(NoticeDTO noticeDTO) {
		return noticeDAO.setUpdate(noticeDTO);
	}
}
