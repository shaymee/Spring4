package com.shaymee.s4.notice;

import static org.junit.Assert.assertEquals;
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
	public void setDeleteTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(3L);
		int result = noticeDAO.setDelete(noticeDTO);
		assertEquals(1, result);
	}
	
//	@Test
	public void setListTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("Hello");
		noticeDTO.setContents("where are u going?");
		noticeDTO.setWriter("walker");
		noticeDTO.setHits(0L);
		
		int result = noticeDAO.setInsert(noticeDTO);
		assertEquals(1, result);
	}
	
//	@Test
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
