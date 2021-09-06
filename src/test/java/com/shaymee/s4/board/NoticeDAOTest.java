package com.shaymee.s4.board;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shaymee.s4.MyJunitTest;
import com.shaymee.s4.board.notice.NoticeDAO;
import com.shaymee.s4.board.notice.NoticeDTO;
import com.shaymee.s4.board.qna.QnaDAO;

public class NoticeDAOTest extends MyJunitTest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getSelectTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setNum(43L);
		NoticeDTO noticeDTO = noticeDAO.getSelect(boardDTO);
		
		assertNotNull(noticeDTO);
		System.out.println(noticeDTO.getTitle());
	}

}
