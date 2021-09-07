package com.shaymee.s4.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaymee.s4.board.BoardDTO;
import com.shaymee.s4.board.BoardService;
import com.shaymee.s4.board.pager.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		Long totalCount = noticeDAO.totalCount(pager);
		pager.makeNum(totalCount);
		pager.makeRow();		
		
		return noticeDAO.getList(pager);
	}

	@Override
	public NoticeDTO getSelect(BoardDTO boardDTO) throws Exception {
		noticeDAO.setHitsUpdate(boardDTO);
		return noticeDAO.getSelect(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO) throws Exception {
		return noticeDAO.setInsert(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		return noticeDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return noticeDAO.setUpdate(boardDTO);
	}

}
