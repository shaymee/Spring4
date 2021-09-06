package com.shaymee.s4.notice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shaymee.s4.MyJunitTest;

public class NoticeDAOTest extends MyJunitTest{
	
	@Autowired	
	private NoticeDAO noticeDAO;

//	@Test
	public void setUpdateTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(23L);
		noticeDTO.setTitle("fucku");
		noticeDTO.setContents("zz");
		
		int result = noticeDAO.setUpdate(noticeDTO);
		assertEquals(1, result);
	}
	
	
//	@Test
	public void setDeleteTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(3L);
		int result = noticeDAO.setDelete(noticeDTO);
		assertEquals(1, result);
	}
	
	@Test
	public void setInsertTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		Random random = new Random();
		
		for(int i=0;i<300;i++) {
			noticeDTO.setTitle("title"+i);
			noticeDTO.setContents("contents"+i);
			noticeDTO.setWriter("writer"+i);
			
			int result = noticeDAO.setInsert(noticeDTO);
			
			if(i%10 == 0) {
				Thread.sleep(500);
			}
		}
		
		System.out.println("==== finish ====");
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
