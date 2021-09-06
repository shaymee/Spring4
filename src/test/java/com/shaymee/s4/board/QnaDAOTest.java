package com.shaymee.s4.board;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shaymee.s4.MyJunitTest;
import com.shaymee.s4.board.qna.QnaDAO;
import com.shaymee.s4.board.qna.QnaDTO;

public class QnaDAOTest extends MyJunitTest {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void setInsertTest() throws Exception {
		
		for(int i=0;i<50;i++) {
			QnaDTO qnaDTO = new QnaDTO();
			qnaDTO.setTitle("QnaTitle"+i);
			qnaDTO.setContents("QnaContents"+i);
			qnaDTO.setWriter("QnaWriter"+i);
			
			qnaDAO.setInsert(qnaDTO);
			
			if(i == 10) {
				Thread.sleep(500);
			}
		}
		
	}
	

}
