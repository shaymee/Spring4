package com.shaymee.s4.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaymee.s4.board.BoardDTO;
import com.shaymee.s4.board.BoardService;
import com.shaymee.s4.board.pager.Pager;

@Service
public class QnaService implements BoardService {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		Long totalCount = qnaDAO.totalCount(pager);
		pager.makeNum(totalCount);
		pager.makeRow();
		
		return qnaDAO.getList(pager);
	}

	@Override
	public QnaDTO getSelect(BoardDTO boardDTO) throws Exception {
		qnaDAO.setHitsUpdate(boardDTO);		
		return qnaDAO.getSelect(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setInsert(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return qnaDAO.setUpdate(boardDTO);
	}
	
	//답글 달기. Notice에는 없고 QNA에만 있는 기능
	public int setReply(QnaDTO qnaDTO) throws Exception { // 얘는 QNA에서만 쓰는거니까 일단 QnaDTO를 매개변수로 선언
		QnaDTO parent = qnaDAO.getSelect(qnaDTO);
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		int result = qnaDAO.setReplyUpdate(parent);
		
		result = qnaDAO.setReply(qnaDTO);
				
		return result;
	}

}
