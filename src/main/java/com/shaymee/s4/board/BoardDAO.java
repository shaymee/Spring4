package com.shaymee.s4.board;

import java.util.List;

import com.shaymee.s4.board.pager.Pager;

public interface BoardDAO {

	//List
	public abstract List<BoardDTO> getList(Pager pager) throws Exception; // <복습!>추상메서드: { }를 제외한 선언부까지만 
	
	//상세
	public abstract BoardDTO getSelect(BoardDTO boardDTO) throws Exception;
	
	//글쓰기
	public int setInsert(BoardDTO boardDTO) throws Exception;
	
	//글삭제
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
	//글수정
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	
}
