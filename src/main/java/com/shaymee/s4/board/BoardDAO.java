package com.shaymee.s4.board;

import java.util.List;

public interface BoardDAO {

	//전체 갯수(totalCount)
	public Long getTotalCount() throws Exception; // 나중에 매개변수로 Pager 넣어줘야 함
	
	//List
	public abstract List<BoardDTO> getList() throws Exception; // <복습!>추상메서드: { }를 제외한 선언부까지만 
	
	//상세
	public abstract BoardDTO getSelect(BoardDTO boardDTO) throws Exception;
	
	//글쓰기
	public int setInsert(BoardDTO boardDTO) throws Exception;
	
	//글삭제
	public int setDelete(BoardDTO boardDTO) throws Exception;
	
	//글수정
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	
}
