package com.shaymee.s4.notice;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shaymee.s4.util.NoticePager;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shaymee.s4.notice.NoticeDAO.";
	
	//// Delete /////
	public int setDelete(NoticeDTO noticeDTO) {
		return sqlSession.delete(NAMESPACE+"setDelete", noticeDTO);
	}
	
	//// List ////
	public List<NoticeDTO> getList(NoticePager pager) {
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	//// SELECT ////
	public NoticeDTO getSelect(NoticeDTO noticeDTO) {
		return sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
	}
	
	//// INSERT ////
	public int setInsert(NoticeDTO noticeDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
	}
	
	//// UPDATE ////
	public int setUpdate(NoticeDTO noticeDTO) {
		return sqlSession.update(NAMESPACE+"setUpdate", noticeDTO);				
	}

	
}
