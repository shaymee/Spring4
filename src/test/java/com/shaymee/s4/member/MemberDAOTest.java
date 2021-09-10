package com.shaymee.s4.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shaymee.s4.MyJunitTest;

public class MemberDAOTest extends MyJunitTest {
	
	@Autowired //의존성을 주입시킴 이쪽에
	private MemberDAO memberDAO;
	
	@Test
	public void getLoginTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("cc1");
		memberDTO.setPw("cc1");
		
		assertNotNull(memberDTO);
		//시간관계상 테스트는 재끼신데
	}
	
	
//	@Test
	public void getIdCheckTest() throws Exception {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("123456789");
		
		memberDTO = memberDAO.getIdCheck(memberDTO);
		
		assertNotNull(memberDTO);
	}

}
