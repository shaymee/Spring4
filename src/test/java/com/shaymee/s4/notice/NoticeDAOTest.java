package com.shaymee.s4.notice;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shaymee.s4.MyJunitTest;

public class NoticeDAOTest extends MyJunitTest{
	
	@Autowired	
	private NoticeDAO noticeDAO;

	@Test
	public void getListTest() {
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
//	@Test
	public void getSelectTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1L);
		noticeDAO.getSelect(noticeDTO);
		
		assertNotNull(noticeDTO);
	}
	
}
