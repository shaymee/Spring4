package com.shaymee.s4.notice;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shaymee.s4.notice.NoticeDAO.";
	
	public int setDelete(NoticeDTO noticeDTO) {
		return sqlSession.delete(NAMESPACE+"setDelete", noticeDTO);
	}
	
	public List<NoticeDTO> getList() {
		List<NoticeDTO> ar = sqlSession.selectList(NAMESPACE+"getList");
		System.out.println("ar.size : "+ar.size());
		return ar;
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO) {
		return sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
	}
	
	public int setInsert(NoticeDTO noticeDTO) {
		return sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
	}
	
}
